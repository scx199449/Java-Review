public class Tell {

    private String text;
    private int number;

    public Tell() {
    }

    public Tell(String text, int number) {
        this.text = text;
        this.number = number;
    }

    public void say(){
        System.out.println(this.text);
    }

    public void saynumber(){
        System.out.println(this.number);
    }


}
