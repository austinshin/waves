# Waves
a game called waves (following a youtube tutorial)

_What I've Learned so far:_

# **Game Loop** 
is necessary for every game. Every game has one. Example of a game loop below.

```
while (true) {
    processInput();
    update();
    render();
    }
```

The gist is basically the program is waiting for your input, but there is still something happening behind the scenes. Once it finally receives an action it will go ahead and update/render etc.

There's a bunch of stuff related to FPS/Threading/tick related stuff that I don't really understand completely.

# **Handler**
The handler class deals with an event. Something occurs and then you just deal with it in some form of a callback. 

# **Player**
Use the player class to tick/render/create Player. Note that everything is a GameObject which is what it inherits from. 

# **GameObject**
Use the GameObject class as an 'abstract' class in order to preset constructors, getters, and methods that whatever objects inherit from this can utilize these methods in the future.

# **KeyInput**
KeyInput inherits from the KeyAdapter class, which is responsible for receiving keyboard 'events'. This class is meant so that you can use your handler class alongside your player objects and then have it respond in some way when it receives an action like 'VK_W','VK_LEFT', etc. 

3 methods commonly used are keyTyped, keyPressed, keyReleased.

# **enum**
I never knew about the enum type as we hadn't discussed it in class before. It's just a data type that is meant to represent a fixed set of constants. What's interesting is that it is also a class type. 

# **Windows/JFrame/swing**
Using swing and JFrame for the first time. Using it seems pretty intuitive. Making windows seems so much easier than expected because of this library. There's so many levels (container, window, frame, component, object, etc.) and they have like a billion methods. 


