package tfc.plataforma.projeto_v1;

import com.fazecast.jSerialComm.SerialPort;
import javafx.fxml.FXML;

/**Classe para enviar commandos ao Arduino*/
public class ArduinoCommands {
    SerialPort port;

    public ArduinoCommands( SerialPort port){
        this.port = port;
    }

    /**Função para enviar um sinal ao Arduino para que os Estores (servo motor) sejam acionados*/
    public void acionarEstores(){
        byte[] data = String.valueOf(1).getBytes();
        if(port != null){
            port.writeBytes(data, data.length);
        }
    }

    /**Função para enviar um sinal ao Arduino para acionar o Buzzer*/
    public void acionarBuzzer(){
        byte[] data = String.valueOf(2).getBytes();
        port.writeBytes(data, data.length);
    }

    /**
     Função para enviar um sinal ao Arduino para acionar ou desligar o LED
     Se o LED já estiver ligado, este será desligado e vice-versa
     */
    public void toggleLED(){
        byte[] data = String.valueOf(3).getBytes();
        port.writeBytes(data, data.length);
    }

    /**
     Função para enviar um sinal ao Arduino para acionar LED
     */
    public void acionarLED(){
        byte[] data = String.valueOf(12).getBytes();
        port.writeBytes(data, data.length);
    }

    /**
     Função para enviar um sinal ao Arduino para desligar LED
     */
    public void desligarLED(){
        byte[] data = String.valueOf(13).getBytes();
        port.writeBytes(data, data.length);
    }

    /**Função que envia sinal ao Arduino para acionar o alarme de Temperatura*/
    public void tempAlarmOn(){
        byte[] data = String.valueOf(8).getBytes();
        if(port != null){
            port.writeBytes(data, data.length);
        }
    }

    /**Função que envia sinal ao Arduino para desligar o alarme de Temperatura*/
    public void tempAlarmOff(){
        byte[] data = String.valueOf(9).getBytes();
        if(port != null){
            port.writeBytes(data, data.length);
        }
    }

    /**Função que envia sinal ao Arduino para acionar o alarme de Luminosidade*/
    public void lumAlarmOn(){
        byte[] data = String.valueOf(10).getBytes();
        if(port != null){
            port.writeBytes(data, data.length);
        }
    }

    /**Função que envia sinal ao Arduino para desligar o alarme de Luminosidade*/
    public void lumAlarmOff(){
        byte[] data = String.valueOf(11).getBytes();
        if(port != null){
            port.writeBytes(data, data.length);
        }
    }

    /**Função que envia sinal ao Arduino para desligar o alarme de Porta*/
    public void doorAlarmOff(){
        byte[] data = String.valueOf(15).getBytes();
        if(port != null){
            port.writeBytes(data, data.length);
        }
    }

    /**Função que envia sinal ao Arduino para ligar o alarme de Porta*/
    public void doorAlarmOn(){
        byte[] data = String.valueOf(14).getBytes();
        if(port != null){
            port.writeBytes(data, data.length);
        }
    }

    /**Função que enviar temperatura máxima*/
    public void tempMax(int temp){
        byte[] data = String.valueOf(16).getBytes();
        if(port != null){
            port.writeBytes(data, data.length);
        }
        data = String.valueOf(temp).getBytes();
        if(port != null){
            port.writeBytes(data, data.length);
        }
    }

    /**Função que enviar temperatura mínima*/
    public void tempMin(int temp){
        byte[] data = String.valueOf(17).getBytes();
        if(port != null){
            port.writeBytes(data, data.length);
        }
        data = String.valueOf(temp).getBytes();
        if(port != null){
            port.writeBytes(data, data.length);
        }
    }

}
