CREATE DATABASE  IF NOT EXISTS `varRestaurante`;
USE `varRestaurante`;

CREATE TABLE `usuarios`(
  `mail` varchar(50) NOT NULL PRIMARY KEY, 
  `nombre` varchar(20) NOT NULL,
  `apellidos` varchar(50) NOT NULL,
  `password` varchar(20) NOT NULL,
  `rol` bit NOT NULL
  
);

CREATE TABLE `categoria`(

  `id_categoria` int NOT NULL AUTO_INCREMENT PRIMARY KEY, 
  `nombre` varchar(20) NOT NULL
  
);

CREATE TABLE `ingredientes`(
 
  `id_ingrediente` int NOT NULL AUTO_INCREMENT PRIMARY KEY, 
  `nombre` varchar(20) NOT NULL,
  `solido_liquido` bit NOT NULL,
  `gramos_total` int ,
  `mililitros_total` int ,
  `precio_kg_l` double NOT NULL
  
);

CREATE TABLE `platos`(

  `id_plato` int NOT NULL AUTO_INCREMENT PRIMARY KEY, 
  `nombre` varchar(20) NOT NULL,
  `precio` double NOT NULL,
  `id_categoria` INT NOT NULL,
  `tipo` int NOT NULL,
   CONSTRAINT `fk_categoria_plato` FOREIGN KEY (`id_categoria`) REFERENCES `categoria` (`id_categoria`)
  
);


CREATE TABLE `plato_ingredientes`(
/*`id_plato_ingredientes` int NOT NULL PRIMARY KEY,*/
`id_plato` int NOT NULL,
`id_ingrediente` int NOT NULL,
`gramos` int ,
`mililitros` int ,
PRIMARY KEY (`id_plato`,`id_ingrediente`),
CONSTRAINT `fk_plato` FOREIGN KEY (`id_plato`) REFERENCES `platos` (`id_plato`),
CONSTRAINT `fk_ingrediente` FOREIGN KEY (`id_ingrediente`) REFERENCES `ingredientes` (`id_ingrediente`)
  
);

CREATE TABLE `menu`(

`id_menu` int NOT NULL AUTO_INCREMENT PRIMARY KEY, 
`nombre` varchar(20) NOT NULL,
`precio` double NOT NULL,
`id_categoria` int NOT NULL,
`id_plato1` int NOT NULL,
`id_plato2` int NOT NULL,
`id_plato3` int NOT NULL,
   CONSTRAINT `fk_primerplato` FOREIGN KEY (`id_plato1`) REFERENCES `platos` (`id_plato`) ON DELETE CASCADE ON UPDATE CASCADE,
   CONSTRAINT `fk_segundoplato` FOREIGN KEY (`id_plato2`) REFERENCES `platos` (`id_plato`) ON DELETE CASCADE ON UPDATE CASCADE,
   CONSTRAINT `fk_tercerplato` FOREIGN KEY (`id_plato3`) REFERENCES `platos` (`id_plato`) ON DELETE CASCADE ON UPDATE CASCADE,
   CONSTRAINT `fk_categoria_menu` FOREIGN KEY (`id_categoria`) REFERENCES `categoria` (`id_categoria`)

);

CREATE TABLE `reservas`(
`id_reserva` int NOT NULL AUTO_INCREMENT PRIMARY KEY,
`mail` varchar(50) NOT NULL,
`fecha` date NOT NULL,
`turno` bit,
`aforo` int(1), 
`comensales` int NOT NULL,
`comentario` text,
 CONSTRAINT `fk_reserva` FOREIGN KEY (`mail`) REFERENCES `usuarios` (`mail`) ON DELETE CASCADE ON UPDATE CASCADE
);
