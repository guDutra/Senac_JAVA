CREATE DATABASE  IF NOT EXISTS `finaltest` /*!40100 DEFAULT CHARACTER SET utf8mb3 COLLATE utf8_bin */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `finaltest`;
-- MySQL dump 10.13  Distrib 8.0.29, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: finaltest
-- ------------------------------------------------------
-- Server version	8.0.29

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `questao`
--

DROP TABLE IF EXISTS `questao`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `questao` (
  `n_pergunta` int DEFAULT NULL,
  `pergunta` varchar(100) COLLATE utf8_bin DEFAULT NULL,
  `altA` varchar(100) COLLATE utf8_bin DEFAULT NULL,
  `altB` varchar(100) COLLATE utf8_bin DEFAULT NULL,
  `altC` varchar(100) COLLATE utf8_bin DEFAULT NULL,
  `resposta` int DEFAULT NULL,
  `id_questao` int NOT NULL AUTO_INCREMENT,
  `altD` varchar(100) COLLATE utf8_bin DEFAULT NULL,
  `codquestionario` int DEFAULT NULL,
  PRIMARY KEY (`id_questao`),
  KEY `codquestionario_pk` (`codquestionario`) /*!80000 INVISIBLE */
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8mb3 COLLATE=utf8_bin;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `questao`
--

LOCK TABLES `questao` WRITE;
/*!40000 ALTER TABLE `questao` DISABLE KEYS */;
INSERT INTO `questao` VALUES (1,'Quanto é 10 +10?','18','30','20',3,1,'15',2),(1,'Qual a capital da Bélgica?','Luxemburgo','Berlim','Bruxelas',3,2,'Dublin',1),(2,'Qual a idade do Felipe?','35','16','18',1,3,'19',1),(1,'Qual é o fisico mais famoso da história sla?','Airton Senna','Ronaldinho','Einstein',3,4,'Leonardo Trevisol',5),(1,'Como é amigo em ingles?','Mom','Sister','Friend',3,5,'Girlfriend',6),(1,'Qual o nome mae do Pedro?','Gostosa','maria','aNGELA',1,6,'eDUARDA',7),(2,'The verb \'clear\' in the past form?','cluar','cleared','clearred',2,7,'clean',6),(3,'Put this phrase in a question form \"You go to the dentist every week\".','Does you go to the dentist every week?','You go to the dentist every week?','Do you to the dentist every week?',3,8,'The dentist go to you every week?',6),(4,'How do you say \"eu amo taylor swift, ela é a melhro cantora da história\" in english?','I love taylor she\'s the goat.','I love taylor sift, she is the greatest singer ever.','I love taylor swift, she is the greatest singer ever.',3,9,'I love taylor swift she great in history',6),(1,'1','1','1','1',1,10,'1',8),(2,'2','2','2','2',2,11,'2',8),(3,'3','3','3','3',3,12,'3',8),(4,'4','4','4','4',4,13,'4',8),(5,'5','5','5','5',1,14,'5',8),(6,'6','6','6','6',2,15,'6',8);
/*!40000 ALTER TABLE `questao` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-09-12 21:41:30
