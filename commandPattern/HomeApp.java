package commandPattern;

import java.util.*;
public class HomeApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Device tv = new Tv();
        Device lights = new Lights();
        Device speaker = new Speaker();
        Device aircon = new Aircon();
        RemoteControl rc = new RemoteControl();

        // to check if the device is on
        int tvNum = 0;
        int lightNum = 0;
        int speakerNum = 0;
        int airconNum = 0;
        System.out.println("Welcome to Smart Home Automation App!");

        while (true) {
            System.out.println("Your Device/s:");
            System.out.println("1. TV");
            System.out.println("2. Lights");
            System.out.println("3. Speaker");
            System.out.println("4. Aircon");
            System.out.println("0. Exit");
            System.out.print("Choose a device to control: ");
            int choice = sc.nextInt();

            int choice1;
            while (true) {
                if (choice == 0) {
                    break;
                } else if (choice == 1) {
                    System.out.println();
                    System.out.println("Choose what to do for the TV:");
                    System.out.println("1. Power On");
                    System.out.println("2. Power Off");
                    System.out.println("3. Volume Up");
                    System.out.println("4. Volume Down");
                    System.out.println("5. Go back to Device/s");
                    System.out.print("Enter your choice: ");
                    choice1 = sc.nextInt();

                    if (choice1 == 1) {
                        PowerOn powerOn = new PowerOn(tv);
                        rc.commandBox(powerOn);
                        rc.clickButton();
                        tvNum = 1;
                    } else if (choice1 == 2) {
                        PowerOff powerOff = new PowerOff(tv);
                        rc.commandBox(powerOff);
                        rc.clickButton();
                        tvNum = 0;
                    } else if (choice1 == 3) {
                        if (tvNum == 1) {
                            VolumeUp volumeUp = new VolumeUp(tv);
                            rc.commandBox(volumeUp);
                            rc.clickButton();
                        } else {
                            System.out.println("TV is off! Please turn it on.");
                        }
                    } else if (choice1 == 4) {
                        if (tvNum == 1) {
                            VolumeDown volumeDown = new VolumeDown(tv);
                            rc.commandBox(volumeDown);
                            rc.clickButton();
                        } else {
                            System.out.println("TV is off! Please turn it on.");
                        }
                    } else if (choice1 == 5) {
                        System.out.println();
                        break;
                    } else {
                        System.out.println("Invalid! Please choose only from 1 to 5.");
                    }

                } else if (choice == 2) {
                    System.out.println();
                    System.out.println("Choose what to do for the Lights:");
                    System.out.println("1. Power On");
                    System.out.println("2. Power Off");
                    System.out.println("3. Change Mode to Dim");
                    System.out.println("4. Change Mode to Bright");
                    System.out.println("5. Go back to Device/s");
                    System.out.print("Enter your choice: ");
                    choice1 = sc.nextInt();

                    if (choice1 == 1) {
                        PowerOn powerOn = new PowerOn(lights);
                        rc.commandBox(powerOn);
                        rc.clickButton();
                        lightNum = 1;
                    } else if (choice1 == 2) {
                        PowerOff powerOff = new PowerOff(lights);
                        rc.commandBox(powerOff);
                        rc.clickButton();
                        lightNum = 0;
                    } else if (choice1 == 3) {
                        if (lightNum == 1) {
                            ModeDim dimMode = new ModeDim(lights);
                            rc.commandBox(dimMode);
                            rc.clickButton();
                        } else {
                            System.out.println("Lights are off! Please turn it on.");
                        }
                    } else if (choice1 == 4) {
                        if (lightNum == 1) {
                            ModeBright brightMode = new ModeBright(lights);
                            rc.commandBox(brightMode);
                            rc.clickButton();
                        } else {
                            System.out.println("Lights are off! Please turn it on.");
                        }
                    } else if (choice1 == 5) {
                        System.out.println();
                        break;
                    } else {
                        System.out.println("Invalid! Please choose only from 1 to 5.");
                    }

                } else if (choice == 3) {
                    System.out.println();
                    System.out.println("Choose what to do for the Speaker:");
                    System.out.println("1. Power On");
                    System.out.println("2. Power Off");
                    System.out.println("3. Increase Volume");
                    System.out.println("4. Decrease Volume");
                    System.out.println("5. Play Music");
                    System.out.println("6. Next Song");
                    System.out.println("7. Previous Song");
                    System.out.println("8. Go back to Device/s");
                    System.out.print("Enter your choice: ");
                    choice1 = sc.nextInt();

                    if (choice1 == 1) {
                        PowerOn powerOn = new PowerOn(speaker);
                        rc.commandBox(powerOn);
                        rc.clickButton();
                        speakerNum = 1;
                    } else if (choice1 == 2) {
                        PowerOff powerOff = new PowerOff(speaker);
                        rc.commandBox(powerOff);
                        rc.clickButton();
                        speakerNum = 0;
                    } else if (choice1 == 3) {
                        if (speakerNum == 1) {
                            VolumeUp volumeUp = new VolumeUp(speaker);
                            rc.commandBox(volumeUp);
                            rc.clickButton();
                        } else {
                            System.out.println("Speaker are off! Please turn it on.");
                        }
                    } else if (choice1 == 4) {
                        if (speakerNum == 1) {
                            VolumeDown volumeDown = new VolumeDown(speaker);
                            rc.commandBox(volumeDown);
                            rc.clickButton();
                        } else {
                            System.out.println("Speaker are off! Please turn it on.");
                        }
                    } else if (choice1 == 5) {
                        if (speakerNum == 1) {
                            PlayMusic playMusic = new PlayMusic(speaker);
                            rc.commandBox(playMusic);
                            rc.clickButton();
                        } else {
                            System.out.println("Speaker are off! Please turn it on.");
                        }

                    } else if (choice1 == 6) {
                        if (speakerNum == 1) {
                            NextSong nextSong = new NextSong(speaker);
                            rc.commandBox(nextSong);
                            rc.clickButton();
                        } else {
                            System.out.println("Speaker are off! Please turn it on.");
                        }

                    } else if (choice1 == 7) {
                        if (speakerNum == 1) {
                            PrevSong prevSong = new PrevSong(speaker);
                            rc.commandBox(prevSong);
                            rc.clickButton();
                        } else {
                            System.out.println("Speaker are off! Please turn it on.");
                        }
                    } else if (choice1 == 8) {
                        System.out.println();
                        break;
                    } else {
                        System.out.println("Invalid! Please choose only from 1 to 4.");
                    }
                } else if (choice == 4) {
                    System.out.println();
                    System.out.println("Choose what to do for the Aircon:");
                    System.out.println("1. Power On");
                    System.out.println("2. Power Off");
                    System.out.println("3. Increase Temperature");
                    System.out.println("4. Decrease Temperature");
                    System.out.println("5. Change Mode to Swing");
                    System.out.println("6. Change Mode to Steady");
                    System.out.println("7. Go back to Device/s");
                    System.out.print("Enter your choice: ");
                    choice1 = sc.nextInt();

                    if (choice1 == 1) {
                        PowerOn powerOn = new PowerOn(aircon);
                        rc.commandBox(powerOn);
                        rc.clickButton();
                        airconNum = 1;
                    } else if (choice1 == 2) {
                        PowerOff powerOff = new PowerOff(aircon);
                        rc.commandBox(powerOff);
                        rc.clickButton();
                        airconNum  = 0;
                    } else if (choice1 == 3) {
                        if (airconNum == 1) {
                            TempInc tempInc = new TempInc(aircon);
                            rc.commandBox(tempInc);
                            rc.clickButton();
                        } else {
                            System.out.println("Aircon is off! Please turn it on.");
                        }
                    } else if (choice1 == 4) {
                        if (airconNum == 1) {
                            TempDec tempDec = new TempDec(aircon);
                            rc.commandBox(tempDec);
                            rc.clickButton();
                        } else {
                            System.out.println("Aircon is off! Please turn it on.");
                        }
                    } else if (choice1 == 5) {
                        if (airconNum == 1) {
                            ModeSwing modeSwing = new ModeSwing(aircon);
                            rc.commandBox(modeSwing);
                            rc.clickButton();
                        } else {
                            System.out.println("Aircon is off! Please turn it on.");
                        }
                    } else if (choice1 == 6) {
                        if (airconNum == 1) {
                            ModeSteady modeSteady = new ModeSteady(aircon);
                            rc.commandBox(modeSteady);
                            rc.clickButton();
                        } else {
                            System.out.println("Aircon is off! Please turn it on.");
                        }
                    } else if (choice1 == 7) {
                        System.out.println();
                        break;
                    } else {
                        System.out.println("Invalid choice. Please choose only from 1 to 7.");
                    }

                } else {
                    System.out.println("Invalid choice. Please choose only from 0 to 4.");
                    System.out.println();
                    break;
                }
            } if (choice == 0) {
                System.out.println("Shutting Down...");
                break;
            }
        }
    }
}