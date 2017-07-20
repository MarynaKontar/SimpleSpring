package org.app;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.io.Serializable;

/**
 * Created by User on 19.07.2017.
 */
@Component("diskImpl1")//id бина можно здесь и не указывать, будет автоматически создан из названия класс, но только с маленькой буквы
//@Bean
public class DiskImpl1 implements CompactDisk, Serializable{
    public DiskImpl1() {
    }

    public void play() {
        System.out.println("Disk1.play");
    }
}
