DROP PROCEDURE IF EXISTS init_professor; 
DELIMITER // 
CREATE PROCEDURE init_professor() 
BEGIN 
	CREATE TABLE `test`.`professor` (
  `professor_num` INT NOT NULL,
  `professor_name` VARCHAR(20) NULL DEFAULT NULL,
  `professor_age` INT NOT NULL DEFAULT 0,
  
  PRIMARY KEY (`professor_num`));

END // 
DELIMITER ;
show procedure status;