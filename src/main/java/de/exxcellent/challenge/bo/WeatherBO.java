package de.exxcellent.challenge.bo;

/**
 * Definition of Weather Data
 * @author j.jose
 */
public class WeatherBO extends BaseBO {

    private int day;

    private int mxT;

    private int mnT;

    private double avT;

    private double avDP;

    private int oneHrP_tpCpn;

    private int pDir;

    private double avSp;

    private int dir;

    private int mxS;

    private double skyC;

    private int mxR;

    private int mn;

    private double r_avSlp;

    private int absoluteDifference;

    /**
     * Constructor for csv String Input
     * @param weatherDataString
     */
    public WeatherBO(String weatherDataString) {
        String[] weatherData = weatherDataString.split(",");
        this.day = Integer.parseInt(weatherData[0]);
        this.mxT = Integer.parseInt(weatherData[1]);
        this.mnT = Integer.parseInt(weatherData[2]);
        this.avT = Double.parseDouble(weatherData[3]);
        this.avDP = Double.parseDouble(weatherData[4]);
        this.oneHrP_tpCpn = Integer.parseInt(weatherData[5]);
        this.pDir = Integer.parseInt(weatherData[6]);
        this.avSp = Double.parseDouble(weatherData[7]);        
        this.dir = Integer.parseInt(weatherData[8]);
        this.mxS = Integer.parseInt(weatherData[9]);
        this.skyC = Double.parseDouble(weatherData[10]);
        this.mxR = Integer.parseInt(weatherData[11]);
        this.mn = Integer.parseInt(weatherData[12]);
        this.r_avSlp = Double.parseDouble(weatherData[13]);        
        this.absoluteDifference = computeDifference(this.getMxT(), this.getMnT());
    }

    /**
     * Get the value of r_avSlp
     *
     * @return the value of r_avSlp
     */
    public double getR_avSlp() {
        return r_avSlp;
    }

    /**
     * Set the value of r_avSlp
     *
     * @param r_avSlp new value of r_avSlp
     */
    public void setR_avSlp(double r_avSlp) {
        this.r_avSlp = r_avSlp;
    }

    /**
     * Get the value of mn
     *
     * @return the value of mn
     */
    public int getMn() {
        return mn;
    }

    /**
     * Set the value of mn
     *
     * @param mn new value of mn
     */
    public void setMn(int mn) {
        this.mn = mn;
    }

    /**
     * Get the value of mxR
     *
     * @return the value of mxR
     */
    public int getMxR() {
        return mxR;
    }

    /**
     * Set the value of mxR
     *
     * @param mxR new value of mxR
     */
    public void setMxR(int mxR) {
        this.mxR = mxR;
    }

    /**
     * Get the value of skyC
     *
     * @return the value of skyC
     */
    public double getSkyC() {
        return skyC;
    }

    /**
     * Set the value of skyC
     *
     * @param skyC new value of skyC
     */
    public void setSkyC(double skyC) {
        this.skyC = skyC;
    }

    /**
     * Get the value of mxS
     *
     * @return the value of mxS
     */
    public int getMxS() {
        return mxS;
    }

    /**
     * Set the value of mxS
     *
     * @param mxS new value of mxS
     */
    public void setMxS(int mxS) {
        this.mxS = mxS;
    }

    /**
     * Get the value of dir
     *
     * @return the value of dir
     */
    public int getDir() {
        return dir;
    }

    /**
     * Set the value of dir
     *
     * @param dir new value of dir
     */
    public void setDir(int dir) {
        this.dir = dir;
    }

    /**
     * Get the value of avSp
     *
     * @return the value of avSp
     */
    public double getAvSp() {
        return avSp;
    }

    /**
     * Set the value of avSp
     *
     * @param avSp new value of avSp
     */
    public void setAvSp(double avSp) {
        this.avSp = avSp;
    }

    /**
     * Get the value of pDir
     *
     * @return the value of pDir
     */
    public int getpDir() {
        return pDir;
    }

    /**
     * Set the value of pDir
     *
     * @param pDir new value of pDir
     */
    public void setpDir(int pDir) {
        this.pDir = pDir;
    }

    /**
     * Get the value of oneHrP_tpCpn
     *
     * @return the value of oneHrP_tpCpn
     */
    public int getOneHrP_tpCpn() {
        return oneHrP_tpCpn;
    }

    /**
     * Set the value of oneHrP_tpCpn
     *
     * @param oneHrP_tpCpn new value of oneHrP_tpCpn
     */
    public void setOneHrP_tpCpn(int oneHrP_tpCpn) {
        this.oneHrP_tpCpn = oneHrP_tpCpn;
    }

    /**
     * Get the value of avDP
     *
     * @return the value of avDP
     */
    public double getAvDP() {
        return avDP;
    }

    /**
     * Set the value of avDP
     *
     * @param AvDP new value of avDP
     */
    public void setAvDP(double AvDP) {
        this.avDP = AvDP;
    }

    /**
     * Get the value of avT
     *
     * @return the value of avT
     */
    public double getAvT() {
        return avT;
    }

    /**
     * Set the value of avT
     *
     * @param AvT new value of avT
     */
    public void setAvT(double AvT) {
        this.avT = AvT;
    }

    /**
     * Get the value of mnT
     *
     * @return the value of mnT
     */
    public int getMnT() {
        return mnT;
    }

    /**
     * Set the value of mnT
     *
     * @param MnT new value of mnT
     */
    public void setMnT(int MnT) {
        this.mnT = MnT;
    }

    /**
     * Get the value of mxT
     *
     * @return the value of mxT
     */
    public int getMxT() {
        return mxT;
    }

    /**
     * Set the value of mxT
     *
     * @param MxT new value of mxT
     */
    public void setMxT(int MxT) {
        this.mxT = MxT;
    }

    /**
     * Get the value of day
     *
     * @return the value of day
     */
    public int getDay() {
        return day;
    }

    /**
     * Set the value of day
     *
     * @param Day new value of day
     */
    public void setDay(int Day) {
        this.day = Day;
    }

    /**
     * Get the value of absoluteDifference
     *
     * @return the value of absoluteDifference
     */
    public int getAbsoluteDifference() {
        return absoluteDifference;
    }

    /**
     * Set the value of absoluteDifference
     *
     * @param absoluteDifference new value of absoluteDifference
     */
    public void setAbsoluteDifference(int absoluteDifference) {
        this.absoluteDifference = absoluteDifference;
    }
}
