public class Mentor {

//    Composition
    FullTimeMentor fullTimeMentor;
    PartTimeMentor partTimeMentor;
    //MI

    public Mentor(FullTimeMentor fullTimeMentor, PartTimeMentor partTimeMentor) { //MI
        this.fullTimeMentor = fullTimeMentor;
        this.partTimeMentor = partTimeMentor;
    }

    public void manageAccount(){
        fullTimeMentor.createAccount();
        partTimeMentor.createAccount();
        //MI
    }
}