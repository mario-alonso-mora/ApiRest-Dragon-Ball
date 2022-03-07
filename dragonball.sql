

DROP TABLE IF EXISTS `dragonball`;

CREATE TABLE `dragonball` (
  `id` int NOT NULL AUTO_INCREMENT,
  `edad` int DEFAULT NULL,
  `estado` varchar(255) DEFAULT NULL,
  `genero` varchar(255) DEFAULT NULL,
  `lugar_de_nacimiento` varchar(255) DEFAULT NULL,
  `nombre` varchar(255) DEFAULT NULL,
  `raza` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

LOCK TABLES `dragonball` WRITE;

INSERT INTO `dragonball` VALUES (1,30,'Vivo','Masculino','Planeta Vegeta','Son Goku/Kakarot','Saiyan'),(2,36,'Vivo','Masculino','Planeta Vegeta','Vegeta','Saiyan'),(3,38,'Vivo','Masculino','Planeta Vegeta','Broly','Saiyan'),(4,25,'Vivo','Masculino','Planeta Tierra','Son Gohan','Saiyan'),(5,15,'Vivo','Masculino','Planeta Tierra','Son Goten','Saiyan'),(6,16,'Vivo','Masculino','Planeta Tierra','Trunks','Saiyan'),(7,45,'Vivo','Femenino','Planeta Tierra','Bulma','Humana'),(8,45,'Vivo','Femenino','Planeta Tierra','Chichi','Humana'),(9,26,'Vivo','Femenino','Planeta Tierra','Videl','Humana'),(10,1000,'Vivo','Masculino','Desconocido','Bills','Dios de la Destruccion'),(11,1000000,'Vivo','Masculino','Desconocido','Wiss','Angel'),(12,37,'Vivo','Masculino','Planeta Tierra','Krilin','Humano'),(13,110,'Vivo','Masculino','Planeta Tierra','Muten-Roshi','Humano');

UNLOCK TABLES;

