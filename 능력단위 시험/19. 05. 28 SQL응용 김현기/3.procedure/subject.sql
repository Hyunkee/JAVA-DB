DROP PROCEDURE IF EXISTS init_subject; 
DELIMITER // 
CREATE PROCEDURE init_subject() 
BEGIN 
	CREATE TABLE `test`.`subject` (
  `subject_code` VARCHAR(6) NOT NULL,
  `subject_title` VARCHAR(45) NULL DEFAULT NULL,
  `subject_point` INT NOT NULL DEFAULT 0,
  `subject_time` INT NOT NULL DEFAULT 0,
  PRIMARY KEY (`subject_code`));

END // 
DELIMITER ;
show procedure status;
