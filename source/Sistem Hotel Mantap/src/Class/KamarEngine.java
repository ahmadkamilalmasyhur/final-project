/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Irfandi
 */
public class KamarEngine {
    private Kamar DATABASE[];
    private int DB_SIZE;
    
    private int REG_KOSONG = 0, REG_DIPESAN = 0;
    private int PRE_KOSONG = 0, PRE_DIPESAN = 0;
    private int SUI_KOSONG = 0, SUI_DIPESAN = 0;
    private int VIP_KOSONG = 0, VIP_DIPESAN = 0;
    
    Database db = new Database();
    
    public KamarEngine(){
         try {
            INIT_DB();
        } catch (Exception ex) {
            Logger.getLogger(LoginEngine.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void INIT_DB() throws Exception {
        db.READ_DATABASE("kamar", "database\\Kamar.database");
        DATABASE = db.GET_DB_KAMAR();
        DB_SIZE = db.GET_DB_SIZE();
        SCAN_DB();
    }
   
    public int GET_TOTAL_KAMAR_TERSEDIA() {
        return (GET_REG_KOSONG() + GET_PRE_KOSONG() + GET_SUI_KOSONG() + GET_VIP_KOSONG());
    }

    public int GET_TOTAL_KAMAR_DIPESAN() {
        return (GET_REG_DIPESAN() + GET_PRE_DIPESAN() + GET_SUI_DIPESAN() + GET_VIP_DIPESAN());
    }

    public void SCAN_DB() {
        for (int i = 0; i < DB_SIZE; i++) {
            if (DATABASE[i].GET_JENIS_KAMAR().equalsIgnoreCase("Reguler")) {
                if (DATABASE[i].GET_STATUS().equalsIgnoreCase("kosong")) {
                    REG_KOSONG++;
                } else {
                    REG_DIPESAN++;
                }
            } else if (DATABASE[i].GET_JENIS_KAMAR().equalsIgnoreCase("Premium")) {
                if (DATABASE[i].GET_STATUS().equalsIgnoreCase("kosong")) {
                    PRE_KOSONG++;
                } else {
                    PRE_DIPESAN++;
                }
            } else if (DATABASE[i].GET_JENIS_KAMAR().equalsIgnoreCase("Suite")) {
                if (DATABASE[i].GET_STATUS().equalsIgnoreCase("kosong")) {
                    SUI_KOSONG++;
                } else {
                    SUI_DIPESAN++;
                }
            } else {
                if (DATABASE[i].GET_STATUS().equalsIgnoreCase("kosong")) {
                    VIP_KOSONG++;
                } else {
                    VIP_DIPESAN++;
                }
            }
        }
    }
    
    //method sementara untuk melihat database
    public String liat(){
        String a = "init\n";
        for (int i = 0; i < DB_SIZE; i++) {
            a = a +"\n"+DATABASE[i].GET_NOMOR_KAMAR();
            a = a +" -> "+DATABASE[i].GET_STATUS();
        }
        return a;
    }

    /**
     * @return the REG_KOSONG
     */
    public int GET_REG_KOSONG() {
        return REG_KOSONG;
    }

    /**
     * @return the REG_DIPESAN
     */
    public int GET_REG_DIPESAN() {
        return REG_DIPESAN;
    }

    /**
     * @return the PRE_KOSONG
     */
    public int GET_PRE_KOSONG() {
        return PRE_KOSONG;
    }

    /**
     * @return the PRE_DIPESAN
     */
    public int GET_PRE_DIPESAN() {
        return PRE_DIPESAN;
    }

    /**
     * @return the SUI_KOSONG
     */
    public int GET_SUI_KOSONG() {
        return SUI_KOSONG;
    }

    /**
     * @return the SUI_DIPESAN
     */
    public int GET_SUI_DIPESAN() {
        return SUI_DIPESAN;
    }

    /**
     * @return the VIP_KOSONG
     */
    public int GET_VIP_KOSONG() {
        return VIP_KOSONG;
    }

    /**
     * @return the VIP_DIPESAN
     */
    public int GET_VIP_DIPESAN() {
        return VIP_DIPESAN;
    }
}