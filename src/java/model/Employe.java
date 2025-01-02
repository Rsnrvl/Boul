/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import annoted.ColumnField;
import annoted.TableAnnotation;
import java.util.Date;

/**
 *
 * @author rango
 */
@TableAnnotation(nameTable = "employe", sequence = "emp_seq", prefix = "EMP_")
public class Employe {
    @ColumnField(column = "idEmploye", is_increment = true, primary_key = true)
  private String id;
    
    @ColumnField(column = "nomEmploye")
   private String nomEmploye;
    
    @ColumnField(column = "dtn")
   private Date dtn;

    public Employe(String id, String nomEmploye, Date dtn) {
        this.id = id;
        this.nomEmploye = nomEmploye;
        this.dtn = dtn;
    }
   
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNomEmploye() {
        return nomEmploye;
    }

    public void setNomEmploye(String nomEmploye) {
        this.nomEmploye = nomEmploye;
    }

    public Date getDtn() {
        return dtn;
    }

    public void setDtn(Date dtn) {
        this.dtn = dtn;
    }
    
 
    
}
