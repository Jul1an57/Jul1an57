public class ex3 {
    int channel =1;
    int volumelevel =1;
    boolean on = false;
    public ex3(){}
    public void turnOn(){
        on = true;
    }
    public void turnOff(){
        on = false;
    }

    public int getChannel() {
        return channel;
    }

    public void setChannel(int channell) {
        if(on && channell >=1 && channell <=200)
            channel = channell;
    }
    public void setVolume(int volumem){
        if(on && volumem >=1 && volumem <=7)
            volumelevel = volumem;
    }
    public void channelup(){
        if(on && channel <120)
            channel++;
    }
    public void channeldown(){
        if(on && channel>1)
             channel--;
    }
    public void volumeup(){
        if(on && volumelevel <=7)
            volumelevel++;
    }
    public void volumedown (){
        if(on && volumelevel >1)
            volumelevel--;
    }

    public static void main(String[] args) {
        ex3 tv1 = new ex3();
        tv1.turnOn();
        tv1.setChannel(30);
        tv1.setVolume(3);
        ex3 tv2 = new ex3();
        tv2.turnOn();
        tv2.channelup();
        tv2.channelup();
        tv2.volumeup();
        System.out.println("tv1's channel is "+tv1.channel+" and volume level is"+tv1.channel);
        System.out.println("tv2's channel is "+tv2.channel+" and volume level is"+tv2.channel);
    }
}
