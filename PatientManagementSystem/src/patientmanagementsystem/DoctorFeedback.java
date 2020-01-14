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
public class DoctorFeedback {
    private int doctorID;
    private String rating;
    private String notes;
        
    public static class CreateFeedback
    {
        private int doctorID;
        private String rating;
        private String notes;
        
        public CreateFeedback(int doctorID, String notes)
        {
            this.doctorID = doctorID;
            this.notes= notes;
        }
        public CreateFeedback AddRating(String rating)
        {
            this.rating = rating;
            return this;
        }
        public DoctorFeedback build(){
            return new DoctorFeedback(this);
        }
    }    
    
    private DoctorFeedback(CreateFeedback CreateFeedback)
    {
        this.doctorID = CreateFeedback.doctorID;
        this.rating = CreateFeedback.rating;
        this.notes = CreateFeedback.notes;
    }
    public int getDoctorID(){
        return this.doctorID;
    }
    public String getDate() {
        return this.rating;
    }
    public String getTime() {
        return this.notes;
    }
}
