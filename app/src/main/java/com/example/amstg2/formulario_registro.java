package com.example.amstg2;

    //insertarpaciente
    public void insertarpaciente(View v) {
        addNotification();
    }

    private void addNotification() {
        if (android.os.Build.VERSION.SDK_INT >=android.os.Build.VERSION_CODES.O) {
            String id ="canal";
            String description = "AMST";
