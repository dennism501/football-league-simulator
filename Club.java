public class Club {

    String clubName;
    int MP;
    int W;
    int D;
    int L;
    int GF;
    int GA;
    int GD;
    int Pts;

    public String getClubName() {
        return clubName;
    }

    public void setClubName(String clubName) {
        this.clubName = clubName;
    }

    public int getMP() {
        return MP;
    }

    public void setMP(int MP) {
        this.MP = MP;
    }

    public int getW() {
        return W;
    }

    public void setW(int w) {
        W = w;
    }

    public int getD() {
        return D;
    }

    public void setD(int d) {
        D = d;
    }

    public int getL() {
        return L;
    }

    public void setL(int l) {
        L = l;
    }

    public int getGF() {
        return GF;
    }

    public void setGF(int GF) {
        this.GF = GF;
    }

    public int getGA() {
        return GA;
    }

    public void setGA(int GA) {
        this.GA = GA;
    }

    public int getGD() {
        return GD;
    }

    public void setGD(int GD) {
        this.GD = GD;
    }

    public int getPts() {
        return Pts;
    }

    public void setPts(int pts) {
        Pts = pts;
    }

    @Override
    public String toString() {
        return "Club{" +
                "clubName='" + clubName + '\'' +
                ", MP=" + MP +
                ", W=" + W +
                ", D=" + D +
                ", L=" + L +
                ", GF=" + GF +
                ", GA=" + GA +
                ", GD=" + GD +
                ", Pts=" + Pts +
                '}';
    }
}
