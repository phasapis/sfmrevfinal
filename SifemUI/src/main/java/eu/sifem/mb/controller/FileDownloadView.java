package eu.sifem.mb.controller;

import java.io.InputStream;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.servlet.ServletContext;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
 
import org.primefaces.model.DefaultStreamedContent;
import org.primefaces.model.StreamedContent;
 
@ManagedBean(name = "fileDownloadView")
@ViewScoped
public class FileDownloadView {
     
    private StreamedContent file;

    private StreamedContent pImagfile;
    
    private StreamedContent dCenterLineFile;
        
    private StreamedContent pRealFile;
    
    private StreamedContent vMagnFile;
    
    private StreamedContent vPhaseFile;
    
    public FileDownloadView() {       
        //InputStream stream = ((ServletContext)FacesContext.getCurrentInstance().getExternalContext().getContext()).getResourceAsStream("/resources/demo/images/optimus.jpg");
        InputStream stream;
        InputStream pImagFilestream;
        InputStream dCenterLineFileStream;
        InputStream pRealFileStream;
        InputStream vMagnFileStream;
        InputStream vPhaseFileStream;
        
        try {
            stream = new FileInputStream(new File("/sifemtemp/Pak.unv"));
            file = new DefaultStreamedContent(stream, "application/binary", "Pak.unv");
            
            pImagFilestream = new FileInputStream(new File("/sifemtemp/pImagFile.csv"));
            pImagfile = new DefaultStreamedContent(pImagFilestream, "text/csv", "pImagFile.csv");            

            dCenterLineFileStream = new FileInputStream(new File("/sifemtemp/dCenterLineFile.csv"));
            dCenterLineFile = new DefaultStreamedContent(dCenterLineFileStream, "text/csv", "dCenterLineFile.csv");            
            
            pRealFileStream = new FileInputStream(new File("/sifemtemp/pRealFile.csv"));
            pRealFile = new DefaultStreamedContent(pRealFileStream, "text/csv", "pRealFile.csv");            

            vMagnFileStream = new FileInputStream(new File("/sifemtemp/vMagnFile.csv"));
            vMagnFile = new DefaultStreamedContent(vMagnFileStream, "text/csv", "vMagnFile.csv");

            vPhaseFileStream = new FileInputStream(new File("/sifemtemp/vPhaseFile.csv"));
            vPhaseFile = new DefaultStreamedContent(vPhaseFileStream, "text/csv", "vPhaseFile.csv");
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FileDownloadView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
 
    public StreamedContent getFile() {
        return file;
    }

    public StreamedContent getPImagfile() {
        return pImagfile;
    }

    public StreamedContent getpImagfile() {
        return pImagfile;
    }

    public StreamedContent getdCenterLineFile() {
        return dCenterLineFile;
    }

    public StreamedContent getpRealFile() {
        return pRealFile;
    }

    public StreamedContent getvMagnFile() {
        return vMagnFile;
    }

    public StreamedContent getvPhaseFile() {
        return vPhaseFile;
    }
    
    
}