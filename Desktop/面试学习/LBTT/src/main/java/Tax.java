public class Tax {
  private double firstRangeStart;
  private double firstRangeEnd;
  private double secondRangeStart;
  private double secondRangeEnd;
  private double thirdRangeStart;
  private double thirdRangeEnd;
  private double fourthRangeStart;
  private double fourthRangeEnd;
  private double fifthRangeStart;

    public Tax(double firstRangeStart, double firstRangeEnd, double secondRangeStart, double secondRangeEnd, double thirdRangeStart, double thirdRangeEnd, double fourthRangeStart, double fourthRangeEnd, double fifthRangeStart) {
        this.firstRangeStart = firstRangeStart;
        this.firstRangeEnd = firstRangeEnd;
        this.secondRangeStart = secondRangeStart;
        this.secondRangeEnd = secondRangeEnd;
        this.thirdRangeStart = thirdRangeStart;
        this.thirdRangeEnd = thirdRangeEnd;
        this.fourthRangeStart = fourthRangeStart;
        this.fourthRangeEnd = fourthRangeEnd;
        this.fifthRangeStart = fifthRangeStart;
    }

    public double getFirstRangeStart() {
        return firstRangeStart;
    }

    public void setFirstRangeStart(double firstRangeStart) {
        this.firstRangeStart = firstRangeStart;
    }

    public double getFirstRangeEnd() {
        return firstRangeEnd;
    }

    public void setFirstRangeEnd(double firstRangeEnd) {
        this.firstRangeEnd = firstRangeEnd;
    }

    public double getSecondRangeStart() {
        return secondRangeStart;
    }

    public void setSecondRangeStart(double secondRangeStart) {
        this.secondRangeStart = secondRangeStart;
    }

    public double getSecondRangeEnd() {
        return secondRangeEnd;
    }

    public void setSecondRangeEnd(double secondRangeEnd) {
        this.secondRangeEnd = secondRangeEnd;
    }

    public double getThirdRangeStart() {
        return thirdRangeStart;
    }

    public void setThirdRangeStart(double thirdRangeStart) {
        this.thirdRangeStart = thirdRangeStart;
    }

    public double getThirdRangeEnd() {
        return thirdRangeEnd;
    }

    public void setThirdRangeEnd(double thirdRangeEnd) {
        this.thirdRangeEnd = thirdRangeEnd;
    }

    public double getFourthRangeStart() {
        return fourthRangeStart;
    }

    public void setFourthRangeStart(double fourthRangeStart) {
        this.fourthRangeStart = fourthRangeStart;
    }

    public double getFourthRangeEnd() {
        return fourthRangeEnd;
    }

    public void setFourthRangeEnd(double fourthRangeEnd) {
        this.fourthRangeEnd = fourthRangeEnd;
    }

    public double getFifthRangeStart() {
        return fifthRangeStart;
    }

    public void setFifthRangeStart(double fifthRangeStart) {
        this.fifthRangeStart = fifthRangeStart;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Tax{" +
                "firstRangeStart=" + firstRangeStart +
                ", firstRangeEnd=" + firstRangeEnd +
                ", secondRangeStart=" + secondRangeStart +
                ", secondRangeEnd=" + secondRangeEnd +
                ", thirdRangeStart=" + thirdRangeStart +
                ", thirdRangeEnd=" + thirdRangeEnd +
                ", fourthRangeStart=" + fourthRangeStart +
                ", fourthRangeEnd=" + fourthRangeEnd +
                ", fifthRangeStart=" + fifthRangeStart +
                '}';
    }
}