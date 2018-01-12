package se.addq.java4test;

import java.text.SimpleDateFormat;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Random;
import java.util.UUID;
import java.util.concurrent.ThreadLocalRandom;

public class TestData {

    public String generateUUID() {
        UUID uuid = UUID.randomUUID();
        return String.valueOf(uuid);
    }

    public String generateUUID(int length) {
        length--;
        if (length > 35 && length <= 0) {
            throw new IllegalArgumentException("felaktigt antal tecken begärt 1-36");
        }
        return generateUUID().substring(0,length);
    }

    public String getTimestamp() {
        Calendar calendar = Calendar.getInstance();
        // Format the date according to something resembling of ISO standard.
        SimpleDateFormat formater = new SimpleDateFormat("yyyy-MM-dd'T'hh_mm_ss");
        return formater.format(calendar.getTime());
    }

    public String timeTodayRandom(int minHour, int maxHour) {
        int randomHour = ThreadLocalRandom.current().nextInt(minHour, maxHour + 1);

        return ZonedDateTime.now().plusHours(randomHour).withMinute(0).withSecond(0).format( DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss") );
    }

    public String nowPlusHour(int addHour) {
        return ZonedDateTime.now().plusHours(addHour).withMinute(0).withSecond(0).format( DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss") );
    }

    public int getRandomInt() {
        Random randomGenerator = new Random();
        return randomGenerator.nextInt();
    }

    public int getRandomInt(int maxValue) {
        Random randomGenerator = new Random();
        return randomGenerator.nextInt(maxValue);
    }

    public String getRandomNameFromList() {
        Random generate = new Random();
        int randomNumber = generate.nextInt(3);
        String[] name = {"Mats", "Helena", "Viktor"};
        return name[randomNumber];
    }

}
