public class BinaryObserver extends Observer{

    public BinaryObserver(Subject subject){
       this.subject = subject;
       this.subject.attach(this);
    }
 
    @Override
    public void update() {

        if(subject.getState() == 1) {
            System.out.println(", your territory is under attack!");
            subject.setState(0);
        }
       
    }
 }