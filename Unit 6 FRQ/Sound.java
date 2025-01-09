public class Sound {

    /* the array of values in this sound; guaranteed not to be null */
    private int[] samples;
  
    public Sound(int[] samples) {
        this.samples = samples;
    }
    
    public int[] getSamples() {
        return samples;
    }
    
 
    /* Changes those values in this sound that have an amplitude
     * greater than limit. Values greater than limit are changed to
     * limit. Values less than -limit are changed to -limit.
     * The method returns the total number of values that were changed
     * in the array.
     *
     * PRECONDITION: limit ≥ 0
     */
    public int limitAmplitude(int limit) {
        int count = 0;
        for(int i = 0; i < samples.length; i++) {
            if (samples[i] > limit) {
                samples[i] = limit;
                count++;
            } else if (samples[i] < -limit) {
                samples[i] = -limit;
                count++;
            }
        }
        return count;    
    }
  
    /* Removes all silence from the beginning of this sound.
     * Silence is represented by a value of 0.
     *
     * PRECONDITION: samples contains at least one nonzero value
     *
     * POSTCONDITION: the length of samples reflects the removal
     *                of starting silence
     */
    public void trimSilenceFromBeginning() {
        int index = 0;
        while (samples[index] == 0) {
            index++;
        }
        int[] newSamples = new int[samples.length - index];
        for(int i = index; i < samples.length; i++) {
            newSamples[i - index] = samples[i];
        }
        samples = newSamples;
    
    }
}
 