package ru.gb.hw;

import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) {
        ListTwoWay twoWayList = new ListTwoWay();
        ListOneWay oneWayList = new ListOneWay();

        // заполнение
        for (int i=0; i<10; i++){
            twoWayList.addHead(i);
            oneWayList.add(i);
        }

        Logger logger = Logger.getAnonymousLogger();
        // ДВУСВЯЗНЫЙ
        logger.info("ДВУСВЯЗНЫЙ: " + twoWayList.listToString());
        twoWayList.reverse();
        logger.info("разворот  : " + twoWayList.listToString());


        // ОДНОСВЯЗНЫЙ
        logger.info("ОДНОСВЯЗНЫЙ: " + oneWayList.listToString());
        oneWayList.reverse();
        logger.info("разворот   : " + oneWayList.listToString());

    }






}