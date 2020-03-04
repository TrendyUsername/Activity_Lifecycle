package com.example.activitylifecycle;

public class OnModifier {
    int onCreate;
    int onStart;
    int onResume;
    int onPause;
    int onStop;
    int onRestart;
    int onDestroy;

    public int getOnCreate() {
        return onCreate;
    }

    public void setOnCreate(int onCreate) {
        this.onCreate = onCreate;
    }

    public int getOnStart() {
        return onStart;
    }

    public void setOnStart(int onStart) {
        this.onStart = onStart;
    }

    public int getOnResume() {
        return onResume;
    }

    public void setOnResume(int onResume) {
        this.onResume = onResume;
    }

    public int getOnPause() {
        return onPause;
    }

    public void setOnPause(int onPause) {
        this.onPause = onPause;
    }

    public int getOnStop() {
        return onStop;
    }

    public void setOnStop(int onStop) {
        this.onStop = onStop;
    }

    public int getOnRestart() {
        return onRestart;
    }

    public void setOnRestart(int onRestart) {
        this.onRestart = onRestart;
    }

    public int getOnDestroy() {
        return onDestroy;
    }

    public void setOnDestroy(int onDestroy) {
        this.onDestroy = onDestroy;
    }

    public OnModifier(int onCreate, int onStart, int onResume, int onPause, int onStop, int onRestart, int onDestroy) {
        this.onCreate = onCreate;
        this.onStart = onStart;
        this.onResume = onResume;
        this.onPause = onPause;
        this.onStop = onStop;
        this.onRestart = onRestart;
        this.onDestroy = onDestroy;
    }

    public OnModifier() {
        new OnModifier(0,0,0,0,0,0,0);
    }
}
