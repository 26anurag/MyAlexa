import speech_recognition as sr
import pyttsx3
import pywhatkit
import datetime
import wikipedia


listener = sr.Recognizer()
engine = pyttsx3.init('sapi5')
voice = engine.getProperty('voices')
engine.setProperty('voice', voice[1].id)


def talk(audio):
    engine.say(audio)
    engine.runAndWait()

def take_command():
    try:
        with sr.Microphone() as source:
            listener.adjust_for_ambient_noise(source,duration=1)
            print('say something.....')
            voice = listener.listen(source)
            command = listener.recognize_google(voice)
            command = command.lower()
            if 'alexa' in command:
                command = command.replace('alexa','')
                print(command)
    except:
        pass
    return command


def run_alexa():
    command = take_command()
    print(command)
    if 'play' in command:
        song = command.replace('play','')
        talk('playing' + song)
        pywhatkit.playonyt(song)
    elif 'time' in command:
        time = datetime.datetime.now().strftime('%I:%M %p')
        talk('current time is' + time)
    elif 'about' in command:
        person = command.replace('wikipedia', '')
        info = wikipedia.summary(person, 3)
        print(info)
        talk(info)
    elif 'you' in command:
        talk('not bad')
    elif 'hello' in command:
        talk('hello how can i help you')
    elif 'name' in command:
        talk('anurag srivastava ')
    elif 'voice' in command:
        talk('oooo noo i am only your assistant dont consider anything else')
    elif'bye 'in command:
        talk('okk byee...')

    else:
        talk('Plaese say again.')




while True:
    run_alexa()
