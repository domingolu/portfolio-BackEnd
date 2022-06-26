-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
DROP SCHEMA IF EXISTS `mydb` ;

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `mydb` DEFAULT CHARACTER SET utf8 ;
USE `mydb` ;

-- -----------------------------------------------------
-- Table `mydb`.`personas`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `mydb`.`personas` ;

CREATE TABLE IF NOT EXISTS `mydb`.`personas` (
  `idpersona` INT NOT NULL,
  `apellido` VARCHAR(45) NULL,
  `nombre` VARCHAR(45) NULL,
  `foto` VARCHAR(45) NULL,
  `banner` VARCHAR(45) NULL,
  `acercade` VARCHAR(45) NULL,
  `profesion` VARCHAR(45) NULL,
  `direccion` VARCHAR(45) NULL,
  `contacto` VARCHAR(45) NULL,
  `email` VARCHAR(45) NULL,
  PRIMARY KEY (`idpersona`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`usuarios`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `mydb`.`usuarios` ;

CREATE TABLE IF NOT EXISTS `mydb`.`usuarios` (
  `personas_idpersona` INT NOT NULL,
  `username` VARCHAR(45) NULL,
  `password` VARCHAR(45) NULL,
  PRIMARY KEY (`personas_idpersona`),
  CONSTRAINT `fk_usuarios_personas`
    FOREIGN KEY (`personas_idpersona`)
    REFERENCES `mydb`.`personas` (`idpersona`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;

CREATE INDEX `fk_usuarios_personas_idx` ON `mydb`.`usuarios` (`personas_idpersona` ASC) VISIBLE;


-- -----------------------------------------------------
-- Table `mydb`.`social`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `mydb`.`social` ;

CREATE TABLE IF NOT EXISTS `mydb`.`social` (
  `personas_idpersona` INT NOT NULL,
  `github` VARCHAR(45) NULL,
  `whatsapp` VARCHAR(45) NULL,
  `linkedin` VARCHAR(45) NULL,
  PRIMARY KEY (`personas_idpersona`),
  CONSTRAINT `fk_social_personas1`
    FOREIGN KEY (`personas_idpersona`)
    REFERENCES `mydb`.`personas` (`idpersona`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;

CREATE INDEX `fk_social_personas1_idx` ON `mydb`.`social` (`personas_idpersona` ASC) VISIBLE;


-- -----------------------------------------------------
-- Table `mydb`.`experiencia`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `mydb`.`experiencia` ;

CREATE TABLE IF NOT EXISTS `mydb`.`experiencia` (
  `id_experiencia` INT NOT NULL AUTO_INCREMENT,
  `personas_idpersona` INT NOT NULL,
  `trabajo` VARCHAR(45) NULL,
  `duración` VARCHAR(45) NULL,
  `descripcion` VARCHAR(200) NULL,
  `imagen` VARCHAR(250) NULL,
  PRIMARY KEY (`id_experiencia`, `personas_idpersona`),
  CONSTRAINT `fk_experiencia_personas1`
    FOREIGN KEY (`personas_idpersona`)
    REFERENCES `mydb`.`personas` (`idpersona`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`educacion`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `mydb`.`educacion` ;

CREATE TABLE IF NOT EXISTS `mydb`.`educacion` (
  `id_educacion` INT NOT NULL AUTO_INCREMENT,
  `personas_idpersona` INT NOT NULL,
  `educacion` VARCHAR(100) NULL,
  `duración` VARCHAR(45) NULL,
  `descripcion` VARCHAR(100) NULL,
  `imagen` VARCHAR(250) NULL,
  PRIMARY KEY (`id_educacion`, `personas_idpersona`),
  CONSTRAINT `fk_experiencia_personas10`
    FOREIGN KEY (`personas_idpersona`)
    REFERENCES `mydb`.`personas` (`idpersona`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`skills`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `mydb`.`skills` ;

CREATE TABLE IF NOT EXISTS `mydb`.`skills` (
  `id_skills` INT NOT NULL AUTO_INCREMENT,
  `personas_idpersona` INT NOT NULL,
  `skill` VARCHAR(45) NULL,
  `tipo` VARCHAR(45) NULL,
  `porcentaje` INT NULL,
  PRIMARY KEY (`id_skills`, `personas_idpersona`),
  CONSTRAINT `fk_experiencia_personas100`
    FOREIGN KEY (`personas_idpersona`)
    REFERENCES `mydb`.`personas` (`idpersona`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`proyectos`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `mydb`.`proyectos` ;

CREATE TABLE IF NOT EXISTS `mydb`.`proyectos` (
  `id_proyecto` INT NOT NULL AUTO_INCREMENT,
  `personas_idpersona` INT NOT NULL,
  `proyecto` VARCHAR(45) NULL,
  `duración` VARCHAR(45) NULL,
  `descripcion` VARCHAR(100) NULL,
  `imagen` VARCHAR(250) NULL,
  PRIMARY KEY (`id_proyecto`, `personas_idpersona`),
  CONSTRAINT `fk_experiencia_personas11`
    FOREIGN KEY (`personas_idpersona`)
    REFERENCES `mydb`.`personas` (`idpersona`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;

-- -----------------------------------------------------
-- Data for table `mydb`.`personas`
-- -----------------------------------------------------
START TRANSACTION;
USE `mydb`;
INSERT INTO `mydb`.`personas` (`idpersona`, `apellido`, `nombre`, `foto`, `banner`, `acercade`, `profesion`, `direccion`, `contacto`, `email`) VALUES (32797989, 'García', 'Ángel', 'Domingo', NULL, 'Soy un tipo común', 'Full Stack Web Developer Jr.', 'Fulton 6464,  Córdoba - Argentina', '351-3748842', 'domingo.garcia@unc.edu.ar');

COMMIT;


-- -----------------------------------------------------
-- Data for table `mydb`.`usuarios`
-- -----------------------------------------------------
START TRANSACTION;
USE `mydb`;
INSERT INTO `mydb`.`usuarios` (`personas_idpersona`, `username`, `password`) VALUES (32797989, 'domingo', 'domingo');

COMMIT;


-- -----------------------------------------------------
-- Data for table `mydb`.`experiencia`
-- -----------------------------------------------------
START TRANSACTION;
USE `mydb`;
INSERT INTO `mydb`.`experiencia` (`id_experiencia`, `personas_idpersona`, `trabajo`, `duración`, `descripcion`, `imagen`) VALUES (1, 32797989, 'Auxiliar Administrativo', '8', 'Auxiliar IT en Facultad de Lengaus  -UNC: armado y reparación de PCs, mantenimiento de servidores y redes de computadoras.', NULL);
INSERT INTO `mydb`.`experiencia` (`id_experiencia`, `personas_idpersona`, `trabajo`, `duración`, `descripcion`, `imagen`) VALUES (2, 32797989, 'Subjefe de Área', '1', 'Subjefe de Despacho de Alumnos en Area de Enseñanza. Facultad de Artes - UNC', NULL);

COMMIT;


-- -----------------------------------------------------
-- Data for table `mydb`.`educacion`
-- -----------------------------------------------------
START TRANSACTION;
USE `mydb`;
INSERT INTO `mydb`.`educacion` (`id_educacion`, `personas_idpersona`, `educacion`, `duración`, `descripcion`, `imagen`) VALUES (1, 32797989, 'Bachiller en Producción de Bienes y Servicios - Colegio Secundario', '7', 'Colegio Secundario - Especialidad en Recursos Hídricos y Ambiente - ETQ N° 4-017 Bernardino Izuel', NULL);
INSERT INTO `mydb`.`educacion` (`id_educacion`, `personas_idpersona`, `educacion`, `duración`, `descripcion`, `imagen`) VALUES (2, 32797989, 'Ingeniería en Computación', '5', 'Estudiante de Ingeniería en Computación - FCEFYN - UNC', NULL);

COMMIT;


-- -----------------------------------------------------
-- Data for table `mydb`.`proyectos`
-- -----------------------------------------------------
START TRANSACTION;
USE `mydb`;
INSERT INTO `mydb`.`proyectos` (`id_proyecto`, `personas_idpersona`, `proyecto`, `duración`, `descripcion`, `imagen`) VALUES (1, 32797989, 'MULTIPASE', '3', 'Acceso digital seguro - Sistema de cerraduras inteligentes para puertas y portones', NULL);

COMMIT;

