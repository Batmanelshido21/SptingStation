-- MySQL dump 10.13  Distrib 8.1.0, for macos13.3 (arm64)
--
-- Host: localhost    Database: playstation
-- ------------------------------------------------------
-- Server version	8.1.0

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `Cuenta`
--

DROP TABLE IF EXISTS `Cuenta`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `Cuenta` (
  `nombreUsuario` varchar(45) NOT NULL,
  `correo` varchar(100) NOT NULL,
  `password` varchar(45) NOT NULL,
  PRIMARY KEY (`nombreUsuario`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Cuenta`
--

LOCK TABLES `Cuenta` WRITE;
/*!40000 ALTER TABLE `Cuenta` DISABLE KEYS */;
INSERT INTO `Cuenta` VALUES ('Javier1','javier.juarez@gmail.com','12345678'),('Javier2','javier.juarez@gmail.com','12345678'),('Javier3','javier.juarez@gmail.com','12345678'),('Javier4','javier.juarez@gmail.com','12345678'),('Javier5','javier.juarez@gmaill.com','12345678');
/*!40000 ALTER TABLE `Cuenta` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Partida`
--

DROP TABLE IF EXISTS `Partida`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `Partida` (
  `idPartidas` varchar(12) NOT NULL,
  `fecha` date NOT NULL,
  `Cuenta_nombreUsuario` varchar(45) NOT NULL,
  PRIMARY KEY (`idPartidas`,`Cuenta_nombreUsuario`),
  KEY `fk_Partidas_Cuenta1_idx` (`Cuenta_nombreUsuario`),
  CONSTRAINT `fk_Partidas_Cuenta1` FOREIGN KEY (`Cuenta_nombreUsuario`) REFERENCES `Cuenta` (`nombreUsuario`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Partida`
--

LOCK TABLES `Partida` WRITE;
/*!40000 ALTER TABLE `Partida` DISABLE KEYS */;
INSERT INTO `Partida` VALUES ('12345','2014-03-11','Javier2'),('12346','2014-03-11','Javier2'),('asdsad','2014-03-12','Javier1');
/*!40000 ALTER TABLE `Partida` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `PlayStation`
--

DROP TABLE IF EXISTS `PlayStation`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `PlayStation` (
  `noSerie` varchar(10) NOT NULL,
  `nombre` varchar(45) NOT NULL,
  `paisOrigen` varchar(45) NOT NULL,
  `year` int NOT NULL,
  PRIMARY KEY (`noSerie`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `PlayStation`
--

LOCK TABLES `PlayStation` WRITE;
/*!40000 ALTER TABLE `PlayStation` DISABLE KEYS */;
INSERT INTO `PlayStation` VALUES ('3245','PS6','China',2015),('3247','PS7','China',2012),('n123','PSP','China',2006),('N876','PS3','China',2010),('N87654','PS5','China',2017),('n987','PSP','China',2012),('sadasd','PSP','China',2005);
/*!40000 ALTER TABLE `PlayStation` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `PlayStation_has_Cuenta`
--

DROP TABLE IF EXISTS `PlayStation_has_Cuenta`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `PlayStation_has_Cuenta` (
  `PlayStation_noSerie` varchar(10) NOT NULL,
  `Cuenta_nombreUsuario` varchar(45) NOT NULL,
  PRIMARY KEY (`PlayStation_noSerie`,`Cuenta_nombreUsuario`),
  KEY `fk_PlayStation_has_Cuenta_Cuenta1_idx` (`Cuenta_nombreUsuario`),
  KEY `fk_PlayStation_has_Cuenta_PlayStation1_idx` (`PlayStation_noSerie`),
  CONSTRAINT `fk_PlayStation_has_Cuenta_Cuenta1` FOREIGN KEY (`Cuenta_nombreUsuario`) REFERENCES `Cuenta` (`nombreUsuario`),
  CONSTRAINT `fk_PlayStation_has_Cuenta_PlayStation1` FOREIGN KEY (`PlayStation_noSerie`) REFERENCES `PlayStation` (`noSerie`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `PlayStation_has_Cuenta`
--

LOCK TABLES `PlayStation_has_Cuenta` WRITE;
/*!40000 ALTER TABLE `PlayStation_has_Cuenta` DISABLE KEYS */;
/*!40000 ALTER TABLE `PlayStation_has_Cuenta` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `PlayStationPlus`
--

DROP TABLE IF EXISTS `PlayStationPlus`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `PlayStationPlus` (
  `idPlayStationPlus` int NOT NULL,
  `Cuenta_nombreUsuario` varchar(45) NOT NULL,
  `PlayStation_noSerie` varchar(10) NOT NULL,
  PRIMARY KEY (`idPlayStationPlus`,`Cuenta_nombreUsuario`,`PlayStation_noSerie`),
  KEY `fk_PlayStationPlus_Cuenta1_idx` (`Cuenta_nombreUsuario`),
  KEY `fk_PlayStationPlus_PlayStation1_idx` (`PlayStation_noSerie`),
  CONSTRAINT `fk_PlayStationPlus_Cuenta1` FOREIGN KEY (`Cuenta_nombreUsuario`) REFERENCES `Cuenta` (`nombreUsuario`),
  CONSTRAINT `fk_PlayStationPlus_PlayStation1` FOREIGN KEY (`PlayStation_noSerie`) REFERENCES `PlayStation` (`noSerie`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `PlayStationPlus`
--

LOCK TABLES `PlayStationPlus` WRITE;
/*!40000 ALTER TABLE `PlayStationPlus` DISABLE KEYS */;
/*!40000 ALTER TABLE `PlayStationPlus` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-01-13  0:31:20
