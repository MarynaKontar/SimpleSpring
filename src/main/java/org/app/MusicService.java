package org.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

import java.io.Serializable;

/**
 * Created by User on 19.07.2017.
 */
@Service("musicService")
//@Configuration
public class MusicService implements Serializable {
    @Autowired
    @Qualifier("diskImpl2")
//    @Resource(name = "diskImpl2")
//    @Inject - тоже, что и Autowired, но не только для spring, а и для других контейнеров
    //если у нас только одна имплементация CompactDisk, то можно поставить такую аннотацию и эта имплементация
    // будет выбераться автоматически. Если же не одна имплементация, то надо указать или в annotation-config.xml
    // или в @Qualifier("...") какую выберать
    private CompactDisk compactDisk;

    public MusicService() {
    }

    public void makeAction(){
        compactDisk.play();
    }
    public CompactDisk getCompactDisk() {
        return compactDisk;
    }

    public void setCompactDisk(CompactDisk compactDisk) {
        this.compactDisk = compactDisk;
    }
}
