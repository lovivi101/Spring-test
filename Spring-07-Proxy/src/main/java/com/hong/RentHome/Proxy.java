package com.hong.RentHome;

/**
 * @description:
 * @author: hjx
 * @time: 2021年04月08日 8:42
 */
public class Proxy implements Rent{

    private Host host ;

    public Proxy(Host host) {
        this.host = host;
    }

    public Proxy() {
    }

    @Override
    public void rent() {


        SeeHouse();
        host.rent();
        fare();
    }

    private void SeeHouse(){
        System.out.println("带人去看房");
    }

    private void fare(){
        System.out.println("收取中介费");
    }
}
