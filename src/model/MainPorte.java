package model;

import lejos.hardware.port.MotorPort;
import lejos.hardware.port.SensorPort;
import lejos.ev3.*;
import lejos.hardware.sensor.*;
import lejos.hardware.*;
import lejos.hardware.motor.UnregulatedMotor;

public class MainPorte {

	public static void main(String[] args) {
		
		/**
		 * Création des Touch Sensor pour la dédection de l'ouverture et de la fermeture des portes
		 */
		EV3TouchSensor porte1Fermee = new EV3TouchSensor(SensorPort.S1);
		EV3TouchSensor porte1Ouverte = new EV3TouchSensor(SensorPort.S2);
		EV3TouchSensor porte2Fermee = new EV3TouchSensor(SensorPort.S3);
		EV3TouchSensor porte2Ouverte = new EV3TouchSensor(SensorPort.S4);
		
		/**
		 * Création de la détection des capteurs lors de l'ouverture et fermeture des portes
		 */
		SensorMode touchPorte1Fermee = porte1Fermee.getTouchMode();
		SensorMode touchPorte1Ouverte = porte1Ouverte.getTouchMode();
		SensorMode touchPorte2Fermee = porte2Fermee.getTouchMode();
		SensorMode touchPorte2Ouverte = porte2Ouverte.getTouchMode();
	
		/**
		 * Création des deux moteurs permettant les mouvements de la porte
		 */
		UnregulatedMotor moteurDroit = new UnregulatedMotor(MotorPort.A);
		UnregulatedMotor moteurGauche = new UnregulatedMotor(MotorPort.B);
		
		/**
		 * Mise en mouvement des moteurs
		 */		
		moteurDroit.forward();
		moteurGauche.forward();
		
	}

}
