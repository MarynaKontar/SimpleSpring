package org.app;

import org.springframework.stereotype.Component;

/**
 * Created by User on 19.07.2017.
 */
@Component
public class DiskImpl2 implements CompactDisk {
    public void play() {
        System.out.println("Disk2.play");
    }
}
