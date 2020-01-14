/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patientmanagementsystem;

/**
 *
 * @author cex
 */
public class Appointment {
    private int doctorID;
    private int patientID;
    private String date;
    private String time;
        
    public static class CreateAppointment
    {
        private int doctorID;
        private int patientID;
        private String date;
        private String time;
        
        public CreateAppointment(int doctorID,int patientID, String date, String time)
        {
            this.doctorID = doctorID;
            this.patientID = patientID;
            this.date= date;
            this.time= time;
        }
        public Appointment build(){
            return new Appointment(this);
        }
    }    
    
    private Appointment(CreateAppointment createAppointment)
    {
        this.doctorID = createAppointment.doctorID;
        this.patientID = createAppointment.patientID;
        this.date = createAppointment.date;
        this.time = createAppointment.time;
    }
    public int getDoctorID(){
        return this.doctorID;
    }
    public int getPatientID() {
        return this.patientID;
    }
    public String getDate() {
        return this.date;
    }
    public String getTime() {
        return this.time;
    }
}
