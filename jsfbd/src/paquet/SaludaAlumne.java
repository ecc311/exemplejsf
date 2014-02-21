package paquet;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import paquet.AlumneMati;

@ManagedBean
@SessionScoped
public class SaludaAlumne {
 private AlumneMati alumne;
 private int a=9;
 
 public int getA() {
	return a;
}

public void setA(int a) {
	this.a = a;
}

public SaludaAlumne(){
  alumne = new AlumneMati();
 }
 
 public String saludar(){ 
  //Por los momentos no hacemos nada
  return "saludo";
 }

 public AlumneMati getAlumne() {
  return alumne;
 }
}