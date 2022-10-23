    package ru.netology.hw;

    import lombok.AllArgsConstructor;
    import lombok.Data;
    import lombok.NoArgsConstructor;


@NoArgsConstructor
@AllArgsConstructor
@Data

public class Radio {
        private int volume;
        private int stationQuantity = 10;  // количество радиостанций
        private int currentStatQuantity = stationQuantity;
        private int maxStationNumber = stationQuantity - 1;
        private int stationNumber;
        private int currentStatNumber;

//        public Radio() {
//        }

//        public Radio(int volume, int stationQuantity, int currentStatQuantity, int maxStationNumber, int stationNumber, int currentStatNumber) {
//            this.volume = volume;
//            this.stationQuantity = stationQuantity;
//            this.currentStatQuantity = currentStatQuantity;
//            this.maxStationNumber = maxStationNumber;
//            this.stationNumber = stationNumber;
//            this.currentStatNumber = currentStatNumber;
//        }

        public int getVolume() {
            return volume;
        }

        public void setVolume(int volume) {
            this.volume = volume;
        }

        public int getStationQuantity() {
            return stationQuantity;
        }

        public void setStationQuantity(int stationQuantity) {
            this.stationQuantity = stationQuantity;
        }

        public int getCurrentStatQuantity() {
            return currentStatQuantity;
        }

        public void setCurrentStatQuantity(int currentStatQuantity) {
            this.currentStatQuantity = currentStatQuantity;
        }

        public int getMaxStationNumber() {
            return maxStationNumber;
        }

        public void setMaxStationNumber(int maxStationNumber) {
            this.maxStationNumber = maxStationNumber;
        }

        public int getStationNumber() {
            return stationNumber;
        }

        public void setStationNumber(int stationNumber) {
            this.stationNumber = stationNumber;
        }

        public int getCurrentStatNumber() {
            return currentStatNumber;
        }

        public void setCurrentStatNumber(int currentStatNumber) {
            this.currentStatNumber = currentStatNumber;
        }
    }
























