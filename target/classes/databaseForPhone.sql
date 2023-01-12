-- MySQL Script generated by MySQL Workbench
-- Tue Jan 10 14:11:17 2023
-- Model: New Model    Version: 1.0
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
-- Table `mydb`.`Phone_details`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `mydb`.`Phone_details` ;

CREATE TABLE IF NOT EXISTS `mydb`.`Phone_details` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `color` VARCHAR(20) NOT NULL,
  `batrery` INT NOT NULL,
  `price` DECIMAL(10,2) NOT NULL,
  `phone_id` INT NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `id_UNIQUE` (`id` ASC) )
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`service_centers`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `mydb`.`service_centers` ;

CREATE TABLE IF NOT EXISTS `mydb`.`service_centers` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NOT NULL,
  `phone` VARCHAR(45) NOT NULL,
  `email` VARCHAR(45) NOT NULL,
  `address` VARCHAR(45) NOT NULL,
  `open_hours` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `id_UNIQUE` (`id` ASC) )
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`service_requests`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `mydb`.`service_requests` ;

CREATE TABLE IF NOT EXISTS `mydb`.`service_requests` (
  `id` INT NOT NULL,
  `customer_id` INT NOT NULL,
  `phone_id` INT NOT NULL,
  `requested_service` VARCHAR(45) NOT NULL,
  `service_centers_id` INT NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `id_UNIQUE` (`id` ASC) ,
  INDEX `fk_service_requests_service_centers1_idx` (`service_centers_id` ASC) ,
  CONSTRAINT `fk_service_requests_service_centers1`
    FOREIGN KEY (`service_centers_id`)
    REFERENCES `mydb`.`service_centers` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`customers`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `mydb`.`customers` ;

CREATE TABLE IF NOT EXISTS `mydb`.`customers` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `first_name` VARCHAR(50) NOT NULL,
  `last_name` VARCHAR(50) NOT NULL,
  `email` VARCHAR(50) NOT NULL,
  `phone` VARCHAR(50) NOT NULL,
  `address` VARCHAR(50) NOT NULL,
  `service_requests_id` INT NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `id_UNIQUE` (`id` ASC) ,
  INDEX `fk_customers_service_requests1_idx` (`service_requests_id` ASC) ,
  CONSTRAINT `fk_customers_service_requests1`
    FOREIGN KEY (`service_requests_id`)
    REFERENCES `mydb`.`service_requests` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Warranties`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `mydb`.`Warranties` ;

CREATE TABLE IF NOT EXISTS `mydb`.`Warranties` (
  `id` INT NOT NULL,
  `phone_id` INT NULL,
  `start_date` DATETIME NOT NULL,
  `end_date` DATETIME NOT NULL,
  `warrantiescol` VARCHAR(45) NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `id_UNIQUE` (`id` ASC) )
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`Phones`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `mydb`.`Phones` ;

CREATE TABLE IF NOT EXISTS `mydb`.`Phones` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `brand` VARCHAR(45) NOT NULL,
  `model` VARCHAR(45) NOT NULL,
  `release_date` DATETIME NOT NULL,
  `phone_details_id` INT NOT NULL,
  `customers_id` INT NOT NULL,
  `warranties_id` INT NOT NULL,
  `service_requests_id` INT NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `id_UNIQUE` (`id` ASC) ,
  INDEX `fk_phones_phone_details_idx` (`phone_details_id` ASC) ,
  INDEX `fk_phones_customers1_idx` (`customers_id` ASC) ,
  INDEX `fk_phones_warranties1_idx` (`warranties_id` ASC) ,
  INDEX `fk_phones_service_requests1_idx` (`service_requests_id` ASC) ,
  CONSTRAINT `fk_phones_phone_details`
    FOREIGN KEY (`phone_details_id`)
    REFERENCES `mydb`.`Phone_details` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_phones_customers1`
    FOREIGN KEY (`customers_id`)
    REFERENCES `mydb`.`customers` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_phones_warranties1`
    FOREIGN KEY (`warranties_id`)
    REFERENCES `mydb`.`Warranties` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_phones_service_requests1`
    FOREIGN KEY (`service_requests_id`)
    REFERENCES `mydb`.`service_requests` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`shop`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `mydb`.`shop` ;

CREATE TABLE IF NOT EXISTS `mydb`.`shop` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NOT NULL,
  `phone` VARCHAR(45) NOT NULL,
  `email` VARCHAR(45) NOT NULL,
  `address` VARCHAR(45) NOT NULL,
  `open_hours` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `id_UNIQUE` (`id` ASC) )
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`purchases`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `mydb`.`purchases` ;

CREATE TABLE IF NOT EXISTS `mydb`.`purchases` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `customer_id` INT NOT NULL,
  `phone_id` INT NOT NULL,
  `purchase_date` DATETIME NOT NULL,
  `purchase_price` DECIMAL(2) NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `id_UNIQUE` (`id` ASC) )
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`inventory`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `mydb`.`inventory` ;

CREATE TABLE IF NOT EXISTS `mydb`.`inventory` (
  `id` INT NOT NULL,
  `shop_id` INT NOT NULL,
  `phone_id` INT NOT NULL,
  `quantity` INT NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `id_UNIQUE` (`id` ASC) )
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`service_history`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `mydb`.`service_history` ;

CREATE TABLE IF NOT EXISTS `mydb`.`service_history` (
  `id` INT NOT NULL,
  `phone_id` INT NOT NULL,
  `service_center_id` INT NOT NULL,
  `service_type` VARCHAR(45) NOT NULL,
  `customers_id` INT NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `id_UNIQUE` (`id` ASC) ,
  INDEX `fk_service_history_customers1_idx` (`customers_id` ASC) ,
  CONSTRAINT `fk_service_history_customers1`
    FOREIGN KEY (`customers_id`)
    REFERENCES `mydb`.`customers` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`deliveries`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `mydb`.`deliveries` ;

CREATE TABLE IF NOT EXISTS `mydb`.`deliveries` (
  `id` INT NOT NULL,
  `shop_id` INT NOT NULL,
  `customer_id` INT NOT NULL,
  `phone_id` INT NOT NULL,
  `delivery_address` VARCHAR(45) NOT NULL,
  `owner_name` VARCHAR(45) NOT NULL,
  `mobile_number` VARCHAR(45) NOT NULL,
  `status` TINYINT NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `id_UNIQUE` (`id` ASC) )
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`returns`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `mydb`.`returns` ;

CREATE TABLE IF NOT EXISTS `mydb`.`returns` (
  `id` INT NOT NULL,
  `customer_id` INT NOT NULL,
  `customer_mobile` VARCHAR(45) NOT NULL,
  `phone_id` VARCHAR(45) NOT NULL,
  `buing_date` DATETIME NOT NULL,
  `return_date` DATETIME NOT NULL,
  `customers_id` INT NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_returns_customers1_idx` (`customers_id` ASC) ,
  CONSTRAINT `fk_returns_customers1`
    FOREIGN KEY (`customers_id`)
    REFERENCES `mydb`.`customers` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`employees`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `mydb`.`employees` ;

CREATE TABLE IF NOT EXISTS `mydb`.`employees` (
  `id` INT NOT NULL,
  `name` VARCHAR(45) NOT NULL,
  `surname` VARCHAR(45) NOT NULL,
  `role` VARCHAR(45) NOT NULL,
  `email` VARCHAR(45) NOT NULL,
  `phone_number` VARCHAR(45) NOT NULL,
  `shop_center_name` VARCHAR(45) NOT NULL,
  `experience` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`shop_has_purchases`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `mydb`.`shop_has_purchases` ;

CREATE TABLE IF NOT EXISTS `mydb`.`shop_has_purchases` (
  `shop_id` INT NOT NULL,
  `purchases_id` INT NOT NULL,
  PRIMARY KEY (`shop_id`, `purchases_id`),
  INDEX `fk_shop_has_purchases_purchases1_idx` (`purchases_id` ASC) ,
  INDEX `fk_shop_has_purchases_shop1_idx` (`shop_id` ASC) VISIBLE,
  CONSTRAINT `fk_shop_has_purchases_shop1`
    FOREIGN KEY (`shop_id`)
    REFERENCES `mydb`.`shop` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_shop_has_purchases_purchases1`
    FOREIGN KEY (`purchases_id`)
    REFERENCES `mydb`.`purchases` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`shop_has_inventory`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `mydb`.`shop_has_inventory` ;

CREATE TABLE IF NOT EXISTS `mydb`.`shop_has_inventory` (
  `shop_id` INT NOT NULL,
  `inventory_id` INT NOT NULL,
  PRIMARY KEY (`shop_id`, `inventory_id`),
  INDEX `fk_shop_has_inventory_inventory1_idx` (`inventory_id` ASC) ,
  INDEX `fk_shop_has_inventory_shop1_idx` (`shop_id` ASC) ,
  CONSTRAINT `fk_shop_has_inventory_shop1`
    FOREIGN KEY (`shop_id`)
    REFERENCES `mydb`.`shop` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_shop_has_inventory_inventory1`
    FOREIGN KEY (`inventory_id`)
    REFERENCES `mydb`.`inventory` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`shop_has_deliveries`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `mydb`.`shop_has_deliveries` ;

CREATE TABLE IF NOT EXISTS `mydb`.`shop_has_deliveries` (
  `shop_id` INT NOT NULL,
  `deliveries_id` INT NOT NULL,
  PRIMARY KEY (`shop_id`, `deliveries_id`),
  INDEX `fk_shop_has_deliveries_deliveries1_idx` (`deliveries_id` ASC) ,
  INDEX `fk_shop_has_deliveries_shop1_idx` (`shop_id` ASC) ,
  CONSTRAINT `fk_shop_has_deliveries_shop1`
    FOREIGN KEY (`shop_id`)
    REFERENCES `mydb`.`shop` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_shop_has_deliveries_deliveries1`
    FOREIGN KEY (`deliveries_id`)
    REFERENCES `mydb`.`deliveries` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`shop_has_employees`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `mydb`.`shop_has_employees` ;

CREATE TABLE IF NOT EXISTS `mydb`.`shop_has_employees` (
  `shop_id` INT NOT NULL,
  `employees_id` INT NOT NULL,
  PRIMARY KEY (`shop_id`, `employees_id`),
  INDEX `fk_shop_has_employees_employees1_idx` (`employees_id` ASC) ,
  INDEX `fk_shop_has_employees_shop1_idx` (`shop_id` ASC) ,
  CONSTRAINT `fk_shop_has_employees_shop1`
    FOREIGN KEY (`shop_id`)
    REFERENCES `mydb`.`shop` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_shop_has_employees_employees1`
    FOREIGN KEY (`employees_id`)
    REFERENCES `mydb`.`employees` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`cervice_center_employees`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `mydb`.`cervice_center_employees` ;

CREATE TABLE IF NOT EXISTS `mydb`.`cervice_center_employees` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NOT NULL,
  `surname` VARCHAR(45) NOT NULL,
  `role` VARCHAR(45) NOT NULL,
  `email` VARCHAR(45) NOT NULL,
  `phone_number` VARCHAR(45) NOT NULL,
  `service_center_name` VARCHAR(45) NOT NULL,
  `experience` VARCHAR(45) NOT NULL,
  `service_centers_id` INT NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `id_UNIQUE` (`id` ASC) ,
  INDEX `fk_cervice_center_employees_service_centers1_idx` (`service_centers_id` ASC) ,
  CONSTRAINT `fk_cervice_center_employees_service_centers1`
    FOREIGN KEY (`service_centers_id`)
    REFERENCES `mydb`.`service_centers` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;