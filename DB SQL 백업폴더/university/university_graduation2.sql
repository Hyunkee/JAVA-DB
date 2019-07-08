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
-- Table structure for table `graduation2`
--

DROP TABLE IF EXISTS `graduation2`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `graduation2` (
  `graduation_num` int(11) NOT NULL AUTO_INCREMENT,
  `graduation_student_num` int(11) DEFAULT NULL,
  `graduation_requirement_num` int(11) DEFAULT NULL,
  `graduation_ok` varchar(45) NOT NULL DEFAULT '',
  `graduation_english` int(11) DEFAULT NULL,
  `graduation_project` varchar(45) DEFAULT NULL,
  `graduation_paper` varchar(45) DEFAULT NULL,
  `graduation_test` varchar(45) DEFAULT NULL,
  `graduation_certificate` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`graduation_num`),
  KEY `graduation_requirement_num_idx` (`graduation_requirement_num`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `graduation2`
--

LOCK TABLES `graduation2` WRITE;
/*!40000 ALTER TABLE `graduation2` DISABLE KEYS */;
INSERT INTO `graduation2` VALUES (1,2019160160,1,'ok',50,'Y','Y','N','Y'),(2,NULL,2,'no',60,'','','',''),(3,NULL,3,'ok',50,'','','','');
/*!40000 ALTER TABLE `graduation2` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-07-08 16:54:38
