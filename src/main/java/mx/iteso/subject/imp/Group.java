package mx.iteso.subject.imp;

import mx.iteso.observer.Observer;
import mx.iteso.observer.imp.User;
import mx.iteso.subject.Subject;

import java.util.ArrayList;
import java.util.HashMap;

public class Group implements Subject {
    ArrayList<Observer> groupList;
    String groupName;

    public Group(String name) {
        this.groupList = new ArrayList();
        this.groupName=name;
    }

    public void registerUsers(User user){
        HashMap<String,ArrayList<String>> userGroups=  user.getGroups();
        userGroups.put(groupName,new ArrayList<String>());
        registerObserver(user);
        notifyObservers("fue agregado.", user);
    }


    public void registerObserver(Observer observer) {
        groupList.add(observer);
    }

    public void removeObserver(Observer observer) {
        groupList.remove(observer);
    }


    public void notifyObservers(String massage, User user) {
        for (Observer observers: groupList ) {
            observers.scoreUpdate(groupName,massage,user);
        }
    }
}
