package com.joshrsp.sensores;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

import java.util.List;


public class MainActivity extends ActionBarActivity implements SensorEventListener {
    private TextView salida;
    private   String va="Acelerometro : \r\n",va2="\r\nMagnetismo : \r\n",va3="\r\nGyroscope : \r\n",va4="\r\nLight : \r\n",va5="\r\nProximity : \r\n",va6="\r\nPressure: \r\n",va7="\r\nOrientation: \r\n",va8="\r\nRotation Vector: \r\n",va9="\r\nLinear acceleration: \r\n",va10="\r\nGravity: \r\n",va11="\r\nMagnetic Uncalibrated \r\n",va12="\r\nGyroscope Uncalibrated: \r\n",va13="\r\nGame Rotation Vector: \r\n",va14="\r\nGeomagnetic Rotation Vector: \r\n",va15="\r\nSignificant Motion: \r\n";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        salida = (TextView) findViewById(R.id.salida);
        salida.setText("");
        SensorManager sensorManager = (SensorManager)
                getSystemService(SENSOR_SERVICE);
        List<Sensor> listaSensores = sensorManager.
                getSensorList(Sensor.TYPE_ALL);
       /* for(Sensor sensor: listaSensores) {
            log(sensor.getName());
        }*/

        listaSensores = sensorManager.getSensorList(Sensor.TYPE_ACCELEROMETER);
        if (!listaSensores.isEmpty()) {
            Sensor acelerometerSensor = listaSensores.get(0);
            sensorManager.registerListener(this, acelerometerSensor, SensorManager.SENSOR_DELAY_UI);
        }
        listaSensores = sensorManager.getSensorList(Sensor.TYPE_MAGNETIC_FIELD);
        if (!listaSensores.isEmpty()) {
            Sensor magneticSensor = listaSensores.get(0);
            sensorManager.registerListener(this, magneticSensor,SensorManager.SENSOR_DELAY_UI);
        }
       listaSensores = sensorManager.getSensorList(Sensor.TYPE_GYROSCOPE);
        if (!listaSensores.isEmpty()) {
            Sensor GyroscopeSensor = listaSensores.get(0);
            sensorManager.registerListener(this, GyroscopeSensor,SensorManager.SENSOR_DELAY_UI);
        }
        listaSensores = sensorManager.getSensorList(Sensor.TYPE_LIGHT);
        if (!listaSensores.isEmpty()) {
            Sensor LightSensor = listaSensores.get(0);
            sensorManager.registerListener(this, LightSensor,SensorManager.SENSOR_DELAY_UI);
        }
        listaSensores = sensorManager.getSensorList(Sensor.TYPE_PROXIMITY);
        if (!listaSensores.isEmpty()) {
            Sensor ProximitySensor = listaSensores.get(0);
            sensorManager.registerListener(this, ProximitySensor,SensorManager.SENSOR_DELAY_UI);
        }
        listaSensores = sensorManager.getSensorList(Sensor.TYPE_PRESSURE);
        if (!listaSensores.isEmpty()) {
            Sensor PressureSensor = listaSensores.get(0);
            sensorManager.registerListener(this, PressureSensor,SensorManager.SENSOR_DELAY_UI);
        }
        listaSensores = sensorManager.getSensorList(Sensor.TYPE_ORIENTATION);
        if (!listaSensores.isEmpty()) {
            Sensor OrientationSensor = listaSensores.get(0);
            sensorManager.registerListener(this, OrientationSensor,SensorManager.SENSOR_DELAY_UI);
        }
        listaSensores = sensorManager.getSensorList(Sensor.TYPE_ROTATION_VECTOR);
        if (!listaSensores.isEmpty()) {
            Sensor RotationVectorSensor = listaSensores.get(0);
            sensorManager.registerListener(this, RotationVectorSensor,SensorManager.SENSOR_DELAY_UI);
        }
        listaSensores = sensorManager.getSensorList(Sensor.TYPE_LINEAR_ACCELERATION);
        if (!listaSensores.isEmpty()) {
            Sensor LinearAccelarionSensor = listaSensores.get(0);
            sensorManager.registerListener(this, LinearAccelarionSensor,SensorManager.SENSOR_DELAY_UI);
        }
        listaSensores = sensorManager.getSensorList(Sensor.TYPE_GRAVITY);
        if (!listaSensores.isEmpty()) {
            Sensor GravitySensor = listaSensores.get(0);
            sensorManager.registerListener(this, GravitySensor,SensorManager.SENSOR_DELAY_UI);
        }
        listaSensores = sensorManager.getSensorList(Sensor.TYPE_MAGNETIC_FIELD_UNCALIBRATED);
        if (!listaSensores.isEmpty()) {
            Sensor MagneticUncalibratedSensor = listaSensores.get(0);
            sensorManager.registerListener(this, MagneticUncalibratedSensor,SensorManager.SENSOR_DELAY_UI);
        }
        listaSensores = sensorManager.getSensorList(Sensor.TYPE_GYROSCOPE_UNCALIBRATED);
        if (!listaSensores.isEmpty()) {
            Sensor GyroscopeUncalibratedSensor = listaSensores.get(0);
            sensorManager.registerListener(this, GyroscopeUncalibratedSensor,SensorManager.SENSOR_DELAY_UI);
        }
        listaSensores = sensorManager.getSensorList(Sensor.TYPE_GAME_ROTATION_VECTOR);
        if (!listaSensores.isEmpty()) {
            Sensor GameRotationVectorSensor = listaSensores.get(0);
            sensorManager.registerListener(this, GameRotationVectorSensor,SensorManager.SENSOR_DELAY_UI);
        }
        listaSensores = sensorManager.getSensorList(Sensor.TYPE_GEOMAGNETIC_ROTATION_VECTOR);
        if (!listaSensores.isEmpty()) {
            Sensor GeomagneticRotationVectorSensor = listaSensores.get(0);
            sensorManager.registerListener(this, GeomagneticRotationVectorSensor,SensorManager.SENSOR_DELAY_UI);
        }
        listaSensores = sensorManager.getSensorList(Sensor.TYPE_SIGNIFICANT_MOTION);
        if (!listaSensores.isEmpty()) {
            Sensor SignificantSensor = listaSensores.get(0);
            sensorManager.registerListener(this, SignificantSensor,SensorManager.SENSOR_DELAY_UI);
        }
    }
    private void log(String string) {
        salida.append(string + "\n");
    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onSensorChanged(SensorEvent event) {


        synchronized (this) {
            salida.setText("");

            switch(event.sensor.getType()) {

                case Sensor.TYPE_ACCELEROMETER:
                    va="Acelerometro : \r\n";
                    for (int i=0 ; i<3 ; i++) {
                       // log("Acelerómetro "+i+": "+event.values[i]);
                        va=va+"Acelerómetro "+i+": "+event.values[i]+"\r\n";

                    }
                    break;

                case Sensor.TYPE_MAGNETIC_FIELD:
                    va2="\r\nMagnetismo : \r\n";
                    for (int i=0 ; i<3 ; i++) {
                        va2=va2+"Magnetismo "+i+": "+event.values[i]+"\r\n";
                    }
                    break;
                case Sensor.TYPE_GYROSCOPE:
                    va3="\r\nGyroscope : \r\n";
                    for (int i=0 ; i<3 ; i++) {
                        va3=va3+"Gyroscope "+i+": "+event.values[i]+"\r\n";
                    }
                    break;
                case Sensor.TYPE_LIGHT:
                    va4="\r\nLight : \r\n";
                    for (int i=0 ; i<1 ; i++) {
                        va4=va4+"Light "+i+": "+event.values[i]+"\r\n";
                    }
                    break;
                case Sensor.TYPE_PROXIMITY:
                    va5="\r\nProximity : \r\n";
                    for (int i=0 ; i<1 ; i++) {
                        va5=va5+"Proximity "+i+": "+event.values[i]+"\r\n";
                    }
                    break;
                case Sensor.TYPE_PRESSURE:
                    va6="\r\nPressure : \r\n";
                    for (int i=0 ; i<3 ; i++) {
                        va6=va6+"Pressure "+i+": "+event.values[i]+"\r\n";
                    }
                    break;
                case Sensor.TYPE_ORIENTATION:
                    va7="\r\nOrientation : \r\n";
                    for (int i=0 ; i<3 ; i++) {
                        va7=va7+"Orientation "+i+": "+event.values[i]+"\r\n";
                    }
                    break;
                case Sensor.TYPE_ROTATION_VECTOR:
                    va8="\r\nRotation Vector : \r\n";
                    for (int i=0 ; i<3 ; i++) {
                        va8=va8+"Rotation Vector "+i+": "+event.values[i]+"\r\n";
                    }
                    break;
                case Sensor.TYPE_LINEAR_ACCELERATION:
                    va9="\r\nLinear acceleration : \r\n";
                    for (int i=0 ; i<3 ; i++) {
                        va9=va9+"Linear acceleration "+i+": "+event.values[i]+"\r\n";
                    }
                    break;
                case Sensor.TYPE_GRAVITY:
                    va10="\r\nGravity : \r\n";
                    for (int i=0 ; i<3 ; i++) {
                        va10=va10+"Gravity "+i+": "+event.values[i]+"\r\n";
                    }
                    break;
                case Sensor.TYPE_MAGNETIC_FIELD_UNCALIBRATED:
                    va11="\r\nMagnetic Uncalibrated : \r\n";
                    for (int i=0 ; i<3 ; i++) {
                        va11=va11+"Magnetic Uncalibrated "+i+": "+event.values[i]+"\r\n";
                    }
                    break;
                case Sensor.TYPE_GYROSCOPE_UNCALIBRATED:
                    va12="\r\nGyroscope Uncalibrated : \r\n";
                    for (int i=0 ; i<3 ; i++) {
                        va12=va12+"Gyroscope Uncalibrated "+i+": "+event.values[i]+"\r\n";
                    }
                    break;
                case Sensor.TYPE_GAME_ROTATION_VECTOR:
                    va13="\r\nGame Rotation Vector : \r\n";
                    for (int i=0 ; i<3 ; i++) {
                        va13=va13+"Game Rotation Vector "+i+": "+event.values[i]+"\r\n";
                    }
                    break;
                case Sensor.TYPE_GEOMAGNETIC_ROTATION_VECTOR:
                    va14="\r\nGeomagnetic Rotation Vector : \r\n";
                    for (int i=0 ; i<3 ; i++) {
                        va14=va14+"Geomagnetic Rotation Vector "+i+": "+event.values[i]+"\r\n";
                    }
                    break;
                case Sensor.TYPE_SIGNIFICANT_MOTION:
                    va15="\r\nSignificant Motion : \r\n";
                    for (int i=0 ; i<3 ; i++) {
                        va15=va15+"Significant Motion "+i+": "+event.values[i]+"\r\n";
                    }
                    break;
                default:



            }
            salida.setText(va+va2+va3+va4+va5+va6+va7+va8+va9+va10+va11+va12+va13+va14+va15);
        }
    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int precision) {}



}
