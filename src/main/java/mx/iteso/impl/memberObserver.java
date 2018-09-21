package mx.iteso.impl;

import mx.iteso.Observer;

import java.util.ArrayList;

public class memberObserver implements Observer {
    ArrayList<String> messages;

    public memberObserver(){
        messages = new ArrayList<String>();
    }

    public void getMessage(String message){
        messages.add(message);
    }

    public boolean readMessagesAndClear(){
        if(messages.isEmpty())
            return false;
        else{
            while(messages.size() > 0){
                System.out.println(messages.get(messages.size() - 1));
                messages.remove(messages.size()-1);
            }
            return true;
        }
    }
    public boolean readMessagesAndKeep(){
        if(messages.isEmpty())
            return false;
        else{
            int temp = messages.size() - 1;
            while( temp >= 0){
                System.out.println(messages.get(temp));
                temp = temp - 1;
            }
            return true;
        }
    }
    public boolean clearMessages(){
        if(messages.isEmpty())
            return false;
        else{
            while(messages.size() > 0){
                messages.remove(messages.size() - 1);
            }
            return true;
        }
    }

}

