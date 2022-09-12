int sensorPin = A0;    // select the input pin for the potentiometer
float sensorValue;
void setup() {
  // declare the ledPin as an OUTPUT:
Serial.begin(9600);
pinMode(A0, INPUT);

}

void loop() {
  // read the value from the sensor:
  sensorValue = analogRead(sensorPin);
  int out = ((sensorValue / 1024)*5)+0.05;
  Serial.print(out);
  delay(100);
}
