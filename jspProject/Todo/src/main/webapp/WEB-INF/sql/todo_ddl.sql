CREATE TABLE `project`.tbl_todo (
  `tno` INT NOT NULL AUTO_INCREMENT,
  `todo` VARCHAR(100) NOT NULL,
  `duedate` DATE NULL DEFAULT (curdate()),
  `finished` TINYINT NOT NULL DEFAULT 0,
  PRIMARY KEY (`tno`));
