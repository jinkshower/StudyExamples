//class SutdaDeck {
//    final int CARD_NUM = 20;
//    SutdaCard[] cards = new SutdaCard[CARD_NUM];
//    SutdaDeck() {
//        for (int i = 0; i < this.cards.length; i++) {
//            int num = i % 10 + 1;
//            boolean isKwang = (i < 10) && (num == 1|| num == 3 || num == 8);
//            cards[i] = new SutdaCard(num, isKwang);
//        }
//    }
//
//    void shuffle() {
//        for (int i = 0; i < this.cards.length; i++) {
//            int index = (int) (Math.random() * this.cards.length);
//            SutdaCard tmp = cards[index];
//            cards[index] = cards[i];
//            cards[i] = tmp;
//        }
//    }
//
//    SutdaCard pick(int index) {
//        if (index < 0 || index >= CARD_NUM) {
//            return null;
//        }
//        return cards[index];
//    }
//
//    SutdaCard pick() {
//        int index = (int) (Math.random() * this.cards.length);
//        return cards[index];
//    }
//}
//
//class SutdaCard {
//    int num;
//    boolean isKwang;
//    SutdaCard() {
//        this(1, true);
//    }
//    SutdaCard(int num, boolean isKwang) {
//        this.num = num;
//        this.isKwang = isKwang;
//    }
//    // info()대신 Object클래스의 toString()을 오버라이딩했다.
//    public String toString() {
//        return num + (isKwang ? "K" : "");
//    }
//}
//class Exercise7_1 {
//    public static void main(String args[]) {
//        SutdaDeck deck = new SutdaDeck();
//        System.out.println(deck.pick(0));
//        System.out.println(deck.pick());
//
//        deck.shuffle();
//
//        for (int i = 0; i < deck.cards.length; i++)
//            System.out.print(deck.cards[i] + ",");
//
//        System.out.println();
//        System.out.println(deck.pick(0));
//    }
//}
//
//class Product {
//
//    int price; // 제품의 가격
//
//    int bonusPoint; // 제품구매 시 제공하는 보너스점수
//
//
//    Product() {}
//    Product(int price) {
//
//        this.price = price;
//
//        bonusPoint = (int) (price / 10.0);
//
//    }
//
//}
//
//
//
//class Tv extends Product {
//
//    Tv() {}
//
//
//
//    public String toString() {
//
//        return "Tv";
//
//    }
//
//}
//
//
//
//class Exercise7_5 {
//
//    public static void main(String[] args) {
//
//        Tv t = new Tv();
//
//    }
//
//}
// 7-5
//class MyTv2 {
//
//    private boolean isPowerOn;
//    private int channel;
//    private int volume;
//    final int MAX_VOLUME = 100;
//    final int MIN_VOLUME = 0;
//    final int MAX_CHANNEL = 100;
//    final int MIN_CHANNEL = 1;
//    private int prevChannel;
//    /* (1) 알맞은 코드를 넣어 완성하시오. */
//
//    public int getChannel() {
//        return channel;
//    }
//
//    public void setChannel(int channel) {
//        if(channel > MAX_CHANNEL || channel < MIN_CHANNEL)
//            return;
//        this.prevChannel = this.channel;
//        this.channel = channel;
//    }
//
//    public int getVolume() {
//        return volume;
//    }
//
//    public void setVolume(int volume) {
//        if(volume > MAX_VOLUME || volume < MIN_VOLUME)
//            return;
//        this.volume = volume;
//    }
//
//    void gotoPrevChannel() {
//        setChannel(prevChannel);
//    }
//}



//class Exercise7_10 {
//
//    public static void main(String args[]) {
//
//        MyTv2 t = new MyTv2();
//
//        t.setChannel(10);
//        System.out.println("CH:"+t.getChannel());
//        t.setChannel(20);
//        System.out.println("CH:"+t.getChannel());
//        t.gotoPrevChannel();
//        System.out.println("CH:"+t.getChannel());
//        t.gotoPrevChannel();
//        System.out.println("CH:"+t.getChannel());
//
//    }
//
//}
//7-6
//class Outer {
//    class Inner {
//        int iv = 100;
//    }
//}
//class Exercise7_25 {
//
//    public static void main(String[] args) {
//        Outer o = new Outer();
//        Outer.Inner i = o.new Inner();
//        System.out.println(i.iv);
//    }
//}
//7-7
//class Outer {
//    static class Inner {
//        int iv = 200;
//    }
//}
//class Exercise7_26 {
//    public static void main(String[] args) {
//        Outer.Inner o = new Outer.Inner();
//        System.out.println(o.iv);
//    }
//}
//7-8
//class Outer {
//    int value = 10;
//    class Inner {
//        int value = 20;
//        void method1() {
//            int value = 30;
//            System.out.println(value);
//            System.out.println(this.value);
//            System.out.println(Outer.this.value);
//        }
//    }
//}
//class Exercise7_27 {
//    public static void main(String args[]) {
//        Outer o = new Outer();
//        Outer.Inner inner = o.new Inner();
//        inner.method1();
//    }
//}
//7-9
//import java.awt.*;
//import java.awt.event.*;
//
//class Exercise7_28 {
//    public static void main(String[] args) {
//        Frame f = new Frame();
//        f.addWindowListener(new WindowAdapter() {
//            public void windowClosing(WindowEvent e) {
//                e.getWindow().setVisible(false);
//                e.getWindow().dispose();
//                System.exit(0);
//            }
//        });
//    }
//}
