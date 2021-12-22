package Symmetric;

import java.security.NoSuchAlgorithmException;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;

public class DES {
	private SecretKey key;

	public SecretKey createKey() throws NoSuchAlgorithmException {
		KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
		keyGenerator.init(128);
		key = keyGenerator.generateKey();
		return key;

	}

	public byte[] encrypt(String text) throws Exception {
		if (key == null)
			return new byte[] {};
		Cipher cipher = Cipher.getInstance("AES");
		cipher.init(Cipher.ENCRYPT_MODE, key);
		byte[] plaintext = text.getBytes("UTF-8");
		byte[] cipherText = cipher.doFinal(plaintext);
		return cipherText;
	}

	public String decrypt(byte[] text) throws Exception {
		if (key == null)
			return null;
		Cipher cipher = Cipher.getInstance("AES");
		cipher.init(Cipher.DECRYPT_MODE, key);

		byte[] plaintext = cipher.doFinal(text);
		String output = new String(plaintext, "UTF-8");
		return output;

	}

	public SecretKey getKey() {
		return this.key;
	}

	public static void main(String[] args) throws Exception {
		DES des = new DES();
		SecretKey key = des.createKey();
		byte[] out = des.encrypt("Khoa công nghệ thông tin");
		System.out.println(new String(out));
		System.out.println(des.decrypt(out));

	}

}
