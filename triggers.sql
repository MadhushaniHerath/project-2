CREATE FUNCTION hash_pass (password VARCHAR(20))
RETURNS VARCHAR(50) DETERMINISTIC
RETURN sha1(password);

DELIMITER $$
CREATE PROCEDURE `check_admin`(IN firstname varchar(250), IN lastname VARCHAR(250), IN username VARCHAR(250), IN password varchar(250) , IN mother_name varchar(250), IN pet_name varchar(250), IN town varchar(250))
  BEGIN

    if (LENGTH(firstname )<1) THEN
    	SIGNAL SQLSTATE VALUE '45007'
        SET MESSAGE_TEXT = "first name is not valid";
    END IF;
    if (LENGTH(lastname )< 1) THEN
    	SIGNAL SQLSTATE VALUE '45008'
        SET MESSAGE_TEXT = "last name is not valid";
    END IF;
	if (LENGTH(username )<1) THEN
    	SIGNAL SQLSTATE VALUE '45006'
        SET MESSAGE_TEXT = "user name is not valid";
    END IF;
    if (LENGTH(password )<8 ) THEN
    	SIGNAL SQLSTATE VALUE '45009'
        SET MESSAGE_TEXT = "Password is not valid";
	END IF;
    if (LENGTH(password )>250) THEN
    	SIGNAL SQLSTATE VALUE '45009'
        SET MESSAGE_TEXT = "Password is not valid";
    END IF;
	if (LENGTH(mother_name )<1) THEN
    	SIGNAL SQLSTATE VALUE '45007'
        SET MESSAGE_TEXT = "mother's name is empty";
    END IF;
	if (LENGTH(pet_name )<1) THEN
    	SIGNAL SQLSTATE VALUE '45007'
        SET MESSAGE_TEXT = "pet's name is empty";
    END IF;
	if (LENGTH(town )<1) THEN
    	SIGNAL SQLSTATE VALUE '45007'
        SET MESSAGE_TEXT = "town name is empty";
    END IF;
  END$$

DELIMITER ;

DELIMITER $$
CREATE PROCEDURE `check_data`(IN machine_id varchar(250), IN start_time TIME, IN stitches VARCHAR(255), IN stop_time TIME, IN run_time int(10) , IN speed int(10) )
  BEGIN
    if (LENGTH(machine_id) <1) THEN
    	SIGNAL SQLSTATE VALUE '45006'
        SET MESSAGE_TEXT = "machine id is not valid";
    END IF;
    if (LENGTH(stitches )<1) THEN
    	SIGNAL SQLSTATE VALUE '45007'
        SET MESSAGE_TEXT = "no of stitches is not valid";
    END IF;
    if (LENGTH(run_time )<1) THEN
    	SIGNAL SQLSTATE VALUE '45008'
        SET MESSAGE_TEXT = "run time is not valid";
    END IF;
    if (LENGTH(speed )<1) THEN
    	SIGNAL SQLSTATE VALUE '45009'
        SET MESSAGE_TEXT = "speed is not valid";
	END IF;
	
    
  END$$

DELIMITER ;


DELIMITER $$
CREATE TRIGGER `check_manager_insert` 
	BEFORE INSERT 
	ON `manager` 
	FOR EACH ROW 
	BEGIN 
	DECLARE new_hash VARCHAR(255);
	CALL check_admin(new.firstname,new.lastname,new.username,new.password,new.mother_name,new.pet_name,new.town);
	SET new_hash = sha1(new.password); 
	SET NEW.password = new_hash;
	
END$$
DELIMITER ;

DELIMITER $$
CREATE TRIGGER `check_manager_update` 
	BEFORE UPDATE 
	ON `manager` 
	FOR EACH ROW 
	BEGIN 
	DECLARE new_hash VARCHAR(255);
	SET new_hash = sha1(new.password); 
	SET NEW.password = new_hash;
	
END$$
DELIMITER ;

DELIMITER $$
CREATE TRIGGER `check_supervisor_update` 
	BEFORE UPDATE 
	ON `supervisor` 
	FOR EACH ROW 
	BEGIN 
	DECLARE new_hash VARCHAR(255);
	SET new_hash = sha1(new.password); 
	SET NEW.password = new_hash;
	
END$$
DELIMITER ;

DELIMITER $$
CREATE TRIGGER `check_supervisor_insert` 
	BEFORE INSERT 
	ON `supervisor` 
	FOR EACH ROW 
	BEGIN 
	DECLARE new_hash VARCHAR(255);
	CALL check_admin(new.firstname,new.lastname,new.username,new.password,new.mother_name,new.pet_name,new.town); 
	SET new_hash = sha1(new.password); 
	SET NEW.password = new_hash;
END$$
DELIMITER ;

DELIMITER $$
CREATE TRIGGER `check_machine_insert` 
	BEFORE INSERT 
	ON `machine` 
	FOR EACH ROW 
	BEGIN 
	CALL check_data(new.machine_id,new.start_time,new.stitches,new.stop_time,new.run_time,new.speed); 
END$$
DELIMITER ;