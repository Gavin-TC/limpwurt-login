# Limpwurt Login

##### A plugin for [RuneLite](https://runelite.net/)

Limpwurt announces when you login!
___

## Customising your sound

### 1. Locate your `.runelite` folder

On windows this is likely to be here: `C:\Users\<your username>\.runelite`

If you aren't sure, it's the same place that stores your `settings.properties`

Within this `.runelite` folder, there should be a `limpwurt-login` folder, which is where the sound files are downloaded to

### 2. Prepare your sound files

Make sure your files are all `.wav` format (just changing the extension won't work, actually convert them)

Make sure the file name __exactly__ matches the name of the existing file (in `limpwurt-login` folder) you want to replace

### 3. Understand how the files are handled

If you replace an existing file in `limpwurt-login` using exactly the same file name, your sound will be loaded instead

If you place a new file with an unexpected file name in `limpwurt-login`, it will be deleted

If you place a new folder inside `limpwurt-login` that is unexpected, this should be left as is, so can be used to store multiple sounds that you may want to swap in at a future date

If you want to revert to a default sound file, simply delete the relevant file in `limpwurt-login` and the default file will be re-downloaded when the plugin next starts

### 4. If it fails to play your sound

Remove your sound and make sure it plays the default sound for that event - if not, there is something misconfigured in your plugin _or in-game_ settings. For example, the collection log event can only be captured if your _in-game_ notifications for collection log slots are turned on

Check that your file is actually a valid `.wav` and not just a renamed `.mp3` or similar

Check that the file is still there in the `limpwurt-login` folder, if you accidentally used an incorrect file name, it won't have been loaded, and will have been deleted
___

### Known Issues

- PulseAudio on linux can just refuse to accept the audio formats used despite claiming to accept them :man_shrugging:
