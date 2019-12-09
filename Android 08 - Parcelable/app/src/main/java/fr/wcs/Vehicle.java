package fr.wcs;

import android.os.Parcel;
import android.os.Parcelable;

public class Vehicle implements Parcelable {

    private String brand;
    private int kilometers;

    public Vehicle(String brand, int kilometers) {
        this.brand = brand;
        this.kilometers = kilometers;
    }

    protected Vehicle(Parcel in) {
        this.brand = in.readString();
        this.kilometers = in.readInt();
    }

    public static final Creator<Vehicle> CREATOR = new Creator<Vehicle>() {
        @Override
        public Vehicle createFromParcel(Parcel in) {
            return new Vehicle(in);
        }

        @Override
        public Vehicle[] newArray(int size) {
            return new Vehicle[size];
        }
    };

    public String getBrand() {
        return this.brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getKilometers() {
        return this.kilometers;
    }

    public void setKilometers(int kilometers) {
        this.kilometers = kilometers;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.brand);
        dest.writeInt(this.kilometers);
    }
}
