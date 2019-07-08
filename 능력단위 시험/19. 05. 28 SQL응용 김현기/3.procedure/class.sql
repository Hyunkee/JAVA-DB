DROP PROCEDURE IF EXISTS init_class; 
DELIMITER // 
CREATE PROCEDURE init_class() 
BEGIN 
	CREATE TABLE `test`.`class` (
   `class_num` INT NOT NULL AUTO_INCREMENT,
  `class_subject_code` VARCHAR(6) NULL,
  `class_professor_num` INT NULL,
  `class_room` VARCHAR(45) NULL DEFAULT NULL,  
  
  PRIMARY KEY (`class_num`));
  

END // 
DELIMITER ;
show procedure status;
ALTER TABLE `test`.`class` 
ADD INDEX `class_subject_code_idx` (`class_subject_code` ASC) VISIBLE;
;
ALTER TABLE `test`.`class` 
ADD CONSTRAINT `class_subject_code`
  FOREIGN KEY (`class_subject_code`)
  REFERENCES `test`.`subject` (`subject_code`)
  ON DELETE NO ACTION
  ON UPDATE NO ACTION;
  
  ALTER TABLE `test`.`class` 
ADD INDEX `class_professor_num_idx` (`class_professor_num` ASC) VISIBLE;
;
ALTER TABLE `test`.`class` 
ADD CONSTRAINT `class_professor_num`
  FOREIGN KEY (`class_professor_num`)
  REFERENCES `test`.`professor` (`professor_num`)
  ON DELETE NO ACTION
  ON UPDATE NO ACTION;