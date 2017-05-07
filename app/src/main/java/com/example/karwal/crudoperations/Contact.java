package com.example.karwal.crudoperations;

/**
 * Created by karwal on 17-04-2017.
 */

public class Contact {
    int _id;
    String _Name;
    String _phone_number;
    String date;
    String time;

    public Contact(int _id,String name,String phone_number){
        this._id=_id;
        this._Name=name;
        this._phone_number=phone_number;
    }

    public Contact(){

    }

    public Contact(String name,String phone_number){
        this._Name=name;
        this._phone_number=phone_number;
    }

    public int get_id() {
        return _id;
    }

    public void set_id(int _id) {
        this._id = _id;
    }

    public String get_Name() {
        return _Name;
    }

    public void set_Name(String _name) {
        this._Name = _name;
    }

    public String get_phone_number() {
        return _phone_number;
    }

    public void set_phone_number(String _phone_number) {
        this._phone_number = _phone_number;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
