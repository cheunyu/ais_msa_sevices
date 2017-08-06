/**
 * @author: cheunyu
 * @file_name: A.java
 * @package_name��com.scyb.rescue.test
 * @project_name��rescue
 * @department��Java Department of Technologies
 * @date: 2012-7-30
 * @time: ����08:50:58
 */
package com.scyb.aisweather.common.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/**
 * ѹ��ʵ���� <br>
 * ��Ҫʵ��:  <br>
 *     <p>ѹ�������ļ���
 *     <p>ѹ���ļ����µ������ļ������ļ���
 *  
 */

import java.io.IOException;
import java.io.InputStream;
import java.io.PushbackInputStream;
import java.util.zip.GZIPInputStream;

public class DecompressNetCdfUtil extends GZIPInputStream {

	public DecompressNetCdfUtil(InputStream in, int size) throws IOException {
		// Wrap the stream in a PushbackInputStream...
		super(new PushbackInputStream(in, size), size);
		this.size = size;
	}

	public DecompressNetCdfUtil(InputStream in) throws IOException {
		// Wrap the stream in a PushbackInputStream...
		super(new PushbackInputStream(in, 1024));
		this.size = -1;
	}

	private DecompressNetCdfUtil(DecompressNetCdfUtil parent) throws IOException {
		super(parent.in);
		this.size = -1;
		this.parent = parent.parent == null ? parent : parent.parent;
		this.parent.child = this;
	}

	private DecompressNetCdfUtil(DecompressNetCdfUtil parent, int size) throws IOException {
		super(parent.in, size);
		this.size = size;
		this.parent = parent.parent == null ? parent : parent.parent;
		this.parent.child = this;
	}

	private DecompressNetCdfUtil parent;

	private DecompressNetCdfUtil child;

	private int size;

	private boolean eos;

	public int read(byte[] inputBuffer, int inputBufferOffset, int inputBufferLen) throws IOException {

		if (eos) {
			return -1;
		}
		if (this.child != null)
			return this.child.read(inputBuffer, inputBufferOffset, inputBufferLen);

		int charsRead = super.read(inputBuffer, inputBufferOffset, inputBufferLen);
		if (charsRead == -1) {
			// Push any remaining buffered data back onto the stream
			// If the stream is then not empty, use it to construct
			// a new instance of this class and delegate this and any
			// future calls to it...
			int n = inf.getRemaining() - 8;
			if (n > 0) {
				// More than 8 bytes remaining in deflater
				// First 8 are gzip trailer. Add the rest to
				// any un-read data...
				((PushbackInputStream) this.in).unread(buf, len - n, n);
			} else {
				// Nothing in the buffer. We need to know whether or not
				// there is unread data available in the underlying stream
				// since the base class will not handle an empty file.
				// Read a byte to see if there is data and if so,
				// push it back onto the stream...
				byte[] b = new byte[1];
				int ret = in.read(b, 0, 1);
				if (ret == -1) {
					eos = true;
					return -1;
				} else
					((PushbackInputStream) this.in).unread(b, 0, 1);
			}

			DecompressNetCdfUtil child;
			if (this.size == -1)
				child = new DecompressNetCdfUtil(this);
			else
				child = new DecompressNetCdfUtil(this, this.size);
			return child.read(inputBuffer, inputBufferOffset, inputBufferLen);
		} else
			return charsRead;
	}

}
