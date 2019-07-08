CREATE DATABASE  IF NOT EXISTS `university` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */;
USE `university`;
-- MySQL dump 10.13  Distrib 8.0.15, for Win64 (x86_64)
--
-- Host: localhost    Database: university
-- ------------------------------------------------------
-- Server version	8.0.15

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
 SET NAMES utf8 ;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `course`
--

DROP TABLE IF EXISTS `course`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `course` (
  `course_num` int(11) NOT NULL AUTO_INCREMENT,
  `course_student_num` int(11) DEFAULT NULL,
  `course_class_num` int(11) DEFAULT NULL,
  `course_mid` double NOT NULL,
  `course_end` double NOT NULL,
  `course_attendance` int(11) DEFAULT NULL,
  `course_report` varchar(45) NOT NULL DEFAULT '',
  `course_total` int(11) DEFAULT NULL,
  `course_rating` varchar(45) NOT NULL DEFAULT '',
  `course_grade` varchar(2) NOT NULL DEFAULT 'F',
  PRIMARY KEY (`course_num`),
  KEY `course_student_num_idx` (`course_student_num`),
  KEY `course_class_num_idx` (`course_class_num`),
  CONSTRAINT `course_class_num` FOREIGN KEY (`course_class_num`) REFERENCES `class` (`class_num`),
  CONSTRAINT `course_student_num` FOREIGN KEY (`course_student_num`) REFERENCES `student` (`student_num`)
) ENGINE=InnoDB AUTO_INCREMENT=20190431 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `course`
--

LOCK TABLES `course` WRITE;
/*!40000 ALTER TABLE `course` DISABLE KEYS */;
INSERT INTO `course` VALUES (1,2019160160,1,40,40,10,'10',100,'','A+'),(2,2019160160,2,40,40,10,'10',100,'','A+'),(3,2019160160,3,70,80,80,'90',101,'','F'),(4,2019170170,2,3,4,0,'0',NULL,'','F'),(5,2019170170,1,4,3,0,'0',NULL,'','F'),(6,2019180180,2,2,5,0,'0',NULL,'','F');
/*!40000 ALTER TABLE `course` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-07-08 16:54:37
