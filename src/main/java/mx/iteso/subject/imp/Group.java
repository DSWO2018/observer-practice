package mx.iteso.subject.imp;

import mx.iteso.observer.Observer;
import mx.iteso.observer.imp.User;
import mx.iteso.subject.Subject;

import java.util.ArrayList;
import java.util.HashMap;

public class Group implements Subject {
    private ArrayList<Observer> groupList;
    private String name;

    @Override
    public String toString() {
        return "Group{" +
                "groupList=" + groupList +
                ", name='" + name + '\'' +
                '}';
    }

    public ArrayList<Observer> getGroupList() {
        return groupList;
    }

    public void setGroupList(ArrayList<Observer> groupList) {
        this.groupList = groupList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Group(String name) {
        setGroupList(new ArrayList());
        setName(name);
    }



    public boolean registerObserver(Observer observer) {
        groupList.add(observer);
        try {
            HashMap<String,ArrayList<String>> userGroups=  ((User)observer).getGroups();
            String userName = ((User)observer).getName();
            userGroups.put(getName(),new ArrayList<String>());
            notifyObservers(userName+" fue agregado.", null);
            return true;
        }catch (Exception e){
            return false;
        }
    }

    public boolean removeObserver(Observer observer) {
        for (Observer observers: groupList ) {
            try{
                String userName = ((User) observer).getName();
                observers.scoreUpdate(getName(),userName + " fue eliminado.");

            }catch (Exception e){

            }

        }
        return groupList.remove(observer);
    }


    public boolean notifyObservers(String massage, Observer observer) {
        boolean all = true;
        for (Observer observers: groupList ) {
            try{
               String userName = ((User) observer).getName();
                observers.scoreUpdate(getName(),userName+": "+massage);

            }catch (Exception e){
                observers.scoreUpdate(getName(),massage);
                all= false;
            }

        }
        return all;
    }
}
