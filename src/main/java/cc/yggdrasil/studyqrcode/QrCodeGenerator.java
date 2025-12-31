package cc.yggdrasil.studyqrcode;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.HashMap;

public class QrCodeGenerator
{
    /**
     * Create a QR code image.
     *
     * @param data    the data to be encoded
     * @param charset the character set
     * @param height  the image height
     * @param width   the image width
     * @return the generated QR code image
     */
    public BufferedImage createQR(final String data, final String charset, int height, int width)
    {
        try
        {
            final BitMatrix matrix = new MultiFormatWriter().encode(
                    new String(data.getBytes(charset), charset),
                    BarcodeFormat.QR_CODE, width, height);

            return MatrixToImageWriter.toBufferedImage(matrix);
        }
        catch (final WriterException | IOException caught)
        {
            System.err.println("Failed to generate QR code: " + caught.getMessage());
        }

        return null;
    }

    /**
     * Create the QR code data to be encoded.
     *
     * @return the input data to be encoded
     */
    public String makeQrCodeData(final String data)
    {
        final HashMap<String, String> inputDataMap = new HashMap<>();

        inputDataMap.put("timestamp", String.valueOf(System.currentTimeMillis()));
        inputDataMap.put("data", data);

        return inputDataMap.toString();
    }
}
