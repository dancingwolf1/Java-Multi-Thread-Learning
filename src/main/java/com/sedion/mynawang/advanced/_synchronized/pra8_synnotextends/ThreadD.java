package com.sedion.mynawang.advanced._synchronized.pra8_synnotextends;

/**
 * @auther mynawang
 * @create 2016-11-11 14:08
 */
public class ThreadD extends Thread{
    private SynNotExtendsSub synNotExtendsSub;

    public ThreadD(SynNotExtendsSub synNotExtendsSub) {
        super();
        this.synNotExtendsSub = synNotExtendsSub;
    }

    @Override
    public void run() {
        synNotExtendsSub.service2();
    }
}
